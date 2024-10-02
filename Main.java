import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        GerenciadorAlunos alunos=new GerenciadorAlunos();
        int menuInicial;

        do {
            System.out.println("1.Inscrever Aluno \n2.Buscar Aluno \n3.Lista de Alunos \n4.Sair");
            menuInicial= scan.nextInt();

            switch (menuInicial){
                case 1:
                    System.out.println("Matricula do Aluno");
                    long matriculaAluno=scan.nextLong();

                    scan.nextLine();

                    System.out.println("CPF do aluno: ");
                    String cpf=scan.nextLine();

                    if (cpf.length()<11){
                        System.out.println("CPF precisa ter 11 digitos");
                        //menuInicial=4;
                        break;
                    }

                    System.out.println("Nome do aluno");
                    String nomeAluno=scan.nextLine();
                    if (!alunos.verificaNome(nomeAluno)){
                        System.out.println("Nome invalido");
                        break;
                    }

                    System.out.println("Idade do Aluno");
                    int idade= scan.nextInt();

                    Aluno aluno=new Aluno(nomeAluno,idade,matriculaAluno,cpf);
                    alunos.listarAlunos(aluno);

                    break;
                case 2:
                    System.out.println("Matricula do Aluno");
                    long matriculaBuscada=scan.nextLong();
                    scan.nextLine();

                    Aluno alunoEncontrado=alunos.buscaAluno(matriculaBuscada);
                    break;
                case 3:
                    System.out.println("Lista de Alunos: ");
                    alunos.listarAlunos();
                    break;
                case 4:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        while (menuInicial!=4);






    }
}
