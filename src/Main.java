public class Main {
    public static void main(String[] args) {
    Pessoa[] p = new Pessoa[3]; //Criação de Vetor para 3 vetores.
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("Matheus", 26, "Masculino");
    p[1] = new Pessoa("Carl", 56, "Masculino");
    p[2] = new Pessoa("Juliana", 25, "Feminino");

    l[0] = new Livro("Dune","Frank Hebert",286,false, p[0]);
    l[1] = new Livro("A Criada", "Frida", 321, true, p[1]);
    l[2] = new Livro("A luta", "Michael Jackson", 456, true, p[2]);


        l[0].abir();
        l[0].folhear(700);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        l[0].avancarPag();
    }
}