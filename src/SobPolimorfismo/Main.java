package SobPolimorfismo;

import encapsulation.Livro;

public class Main {
    public static void main(String[] args) {
     Cachorro c= new Cachorro();

     c.reagir("Olá");
     c.reagir("Toma comida");
     c.reagir("Vai apanhar");
     c.reagir(11, 45);
     c.reagir(21, 15);
     c.reagir(true);
     c.reagir(false);
     c.reagir(2, 12.5f);
     c.reagir(17, 4.5f);

    }
}
