package SobPolimorfismo;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au! Au!");
    }
    public void reagir(String frase) {
        if(frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min) {
        if(hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(Boolean dono) {
        if(dono == true) {
            System.out.println("Abanar e ficar feliz");
         } else {
            System.out.println("Rosnar e morder!!!");
        }
    }
    public void reagir(int idade, float peso) {
        if(idade < 18) {
            if(peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
