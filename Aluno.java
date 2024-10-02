public class Aluno extends GerenciadorAlunos{
    private String nomeAluno;
    private int idadeAluno;
    private long numeroMatricula;
    private String cpf;

    public Aluno(String nomeAluno, int idadeAluno, long numeroMatricula, String cpf) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.numeroMatricula = numeroMatricula;
        this.cpf=cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public long getNumeroMatricula() {
        return numeroMatricula;
    }


}
