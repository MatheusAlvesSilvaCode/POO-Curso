import heranca.Aluno;
import heranca.Professor;
import heranca.ProjetoPessoas;
import heranca.funcionario;

public class Main {
    public static void main(String[] args) {
      ProjetoPessoas p1 = new ProjetoPessoas();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      funcionario p4 = new funcionario();

      p1.setNome("Matheus");
      p2.setNome("Alves");
      p3.setNome("Silva");
      p4.setNome("Carlos");

      p1.setSexo("Masculino");
      p2.setSexo("Feminino");

      p3.receberaumento(700f);

      p1.FazerAniversario();
      p2.FazerAniversario();
      p3.FazerAniversario();

      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());
    }
}