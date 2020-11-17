import java.sql.Timestamp;

public class Main{

    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setNome("Filippo");
        aluno.setMatricula("061170008");
        aluno.setNascimento(Timestamp.valueOf("1999-07-21 00:00:00"));
        aluno.setIdade(21);

        System.out.println(aluno.toJson().toString());

        Aluno b = new Aluno(aluno.toJson());

        System.out.println(b.getNome());

    }

}