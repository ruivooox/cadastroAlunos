import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GerenciadorAlunos {

    List<Aluno> listaAlunos=new ArrayList<>();
    private int numeroDeMatricula;

    //get do numero de matricula;
    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    //set do numero de matricula;
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroDeMatricula = numeroMatricula;
    }

    //metodo de buscaAluno comentado para testes, pois estava atrapalhando na logica dos testes;

//    public Aluno buscaAluno(long matricula){
//        for (Aluno listaAluno : listaAlunos) {
//            if (matricula==(listaAluno.getNumeroMatricula())){
//                System.out.println("Aluno Encontrado: "+listaAluno.getNomeAluno()+"\nMatricula:"+listaAluno.getNumeroDeMatricula()
//                        +" \nIdade:"+listaAluno.getIdadeAluno()+"\nCPF: "+listaAluno.getCpf());
//                return listaAluno;
//            }else {
//                System.out.println("Aluno não encontrado");
//            }
//
//
//            }
//
//
//        return null;
//    }
    //adicionar aluno inscrito a uma lista;
    public void listarAlunos(Aluno aluno ){
        listaAlunos.add(aluno);
        //gerarMatricula();
        System.out.println("Aluno Adicionado com Sucesso!");

    }

    //mostrar a lista de alunos já inscritos;
    public void listarAlunos(){
        if (listaAlunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado");
        }else{
            for (Aluno listaAluno : listaAlunos) {
                System.out.println("Nome: "+listaAluno.getNomeAluno()+"\nMatricula: "+listaAluno.getNumeroMatricula()+"\nCPF: "+listaAluno.getCpf());
            }
        }
    }
    //verificacao, caso algum nome tenha numeros ou caracteres;
    public boolean verificaNome(String nome){
        for (int i = 0; i < nome.length(); i++) {
            char a=nome.charAt(i);
            if (!Character.isLetter(a) && a!=' '){

                return false;
            }
        }
        return true;
    }
    //numero aleatorio de matricula ao se inscrever
    public Aluno gerarMatricula(){
        Random random=new Random();
        int numeroAleatorio=(random.nextInt(1000)*900);
        System.out.println("Sua Matricula é: "+numeroAleatorio);
        setNumeroMatricula(numeroAleatorio);
        return null;
    }
}
