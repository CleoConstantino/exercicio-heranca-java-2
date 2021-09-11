public class Tarefa {

    private String nome;
    private int status;
    private String responsavel;

    public Tarefa(String nome, int status, String responsavel) {
        this.nome = nome;
        this.status = status;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        if (status == 1) {
            return "Pendente";
        }
        if (status == 2) {
            return "Em andamento";
        }
        if (status == 3) {
            return "Concluído";
        }

        return "";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", status=" + getStatus() +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
}
