package FinalProjectPOOJava;


public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 2 POO");
        v[2] = new Video("Projeto Final POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("cREUZA", 25, "F", "Crecre");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}