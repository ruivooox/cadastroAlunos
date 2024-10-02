import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlunos {

    List<Aluno> listaAlunos=new ArrayList<>();




    public Aluno buscaAluno(long matricula){
        for (Aluno listaAluno : listaAlunos) {
            if (matricula==(listaAluno.getNumeroMatricula())){
                System.out.println("Aluno Encontrado: "+listaAluno.getNomeAluno()+"\nMatricula:"+listaAluno.getNumeroMatricula()
                        +" \nIdade:"+listaAluno.getIdadeAluno()+"\nCPF: "+listaAluno.getCpf());
                return listaAluno;
            }else {
                System.out.println("Aluno não encontrado");
            }


            }


        return null;
    }

    public void listarAlunos(Aluno aluno ){
        listaAlunos.add(aluno);
        System.out.println("Aluno Adicionado com Sucesso!");

    }

    public void listarAlunos(){
        if (listaAlunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado");
        }else{
            for (Aluno listaAluno : listaAlunos) {
                System.out.println("Nome: "+listaAluno.getNomeAluno()+"\nMatricula: "+listaAluno.getNumeroMatricula()+"\nCPF: "+listaAluno.getCpf());
            }
        }
    }
    public boolean verificaNome(String nome){
        for (int i = 0; i < nome.length(); i++) {
            char a=nome.charAt(i);
            if (!Character.isLetter(a) && a!=' '){
                
                return false;
            }
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "GerenciadorAlunos{" +
//                "listaAlunos=" + listaAlunos +
//                '}';
//    }
}
