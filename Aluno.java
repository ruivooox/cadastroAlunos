public class Aluno extends GerenciadorAlunos{
    private String nomeAluno;
    private int idadeAluno;
    private Aluno numeroMatricula;
    private String cpf;

    //construtor do objeto;
    public Aluno(String nomeAluno, int idadeAluno ,Aluno numeroMatricula, String cpf) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.numeroMatricula = numeroMatricula;
        this.cpf=cpf;
    }
    //getters dos atributos;

    public String getCpf() {
        return cpf;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public Aluno getNumeroMatricula() {
        return numeroMatricula;

    }


}
