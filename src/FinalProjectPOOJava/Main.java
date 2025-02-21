package FinalProjectPOOJava;


public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 2 POO");
        v[2] = new Video("Projeto Final POO");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 25, "F", "Crecre");
        g[2] = new Gafanhoto("Matheus", 45, "M", "Pipo");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[1], v[0]);
        vis[2] = new Visualizacao(g[2], v[1]);


        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());

        /*
        System.out.println(v[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());*/
    }
}