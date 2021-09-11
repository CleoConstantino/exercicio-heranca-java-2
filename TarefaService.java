import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TarefaService {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Tarefa> tarefas = new ArrayList<>();

    static void criarTarefa() {
        System.out.println("Informe o nome da tarefa");
        String nome = sc.next();

        System.out.println("Informe a status");
        System.out.println("1 - Pendente, 2 - Em andamento, 3 - Finalizado");
        int status = sc.nextInt();

        System.out.println("Informe o responsável");
        String responsavel = sc.next();

        Tarefa tarefa = new Tarefa(nome, status, responsavel);

        tarefas.add(tarefa);

        System.out.println("Tarefa '" + tarefa.getNome() + "' criada!");
    }

    static void editarTarefa() {
        listarTarefas();

        System.out.println("Código para edição:");
        int id = sc.nextInt();

        System.out.println("Informe o nome");
        String nome = sc.next();

        System.out.println("Informe a status");
        System.out.println("1 - Pendente, 2 - Em andamento, 3 - Finalizado");
        int status = sc.nextInt();

        System.out.println("Informe o responsável");
        String responsavel = sc.next();

        Tarefa tarefa = new Tarefa(nome, status, responsavel);

        tarefas.set(id, tarefa);

        System.out.println("Tarefa '" + tarefa.getNome() + "' atualizada!");
    }

    static void excluirTarefa() {
        listarTarefas();

        System.out.println("Código para exclusão:");
        int id = sc.nextInt();

        tarefas.remove(id);

        System.out.println("Tarefa excluída!");
    }

    static void concluirTarefa() {
        listarTarefas();

        System.out.println("Código da tarefa:");
        int id = sc.nextInt();

        Tarefa tarefa = tarefas.get(id);

        tarefa.setStatus(3);

        tarefas.set(id, tarefa);

        System.out.println("Tarefa '" + tarefa.getNome() + "' concluída!");
    }

    static void listarTarefas() {
        AtomicInteger i = new AtomicInteger();
        tarefas.stream().forEach(t -> {
            System.out.println("id: " + i.getAndIncrement() + " - " + t.toString());
        });
    }
}
