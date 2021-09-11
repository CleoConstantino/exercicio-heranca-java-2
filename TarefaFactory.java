import java.util.Scanner;

public class TarefaFactory extends TarefaService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" -- ");
            System.out.println("Operações");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Editar tarefa");
            System.out.println("3 - Excluir tarefa");
            System.out.println("4 - Concluir tarefa");
            System.out.println("5 - Listar tarefas");
            System.out.println("0 - Encerrar");
            System.out.println("Informe a operação desejada: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                criarTarefa();
            }

            if (opcao == 2) {
                editarTarefa();
            }

            if (opcao == 3) {
                excluirTarefa();
            }

            if (opcao == 4) {
                concluirTarefa();
            }

            if (opcao == 5) {
                listarTarefas();
            }
        } while (opcao != 0);
    }

}
