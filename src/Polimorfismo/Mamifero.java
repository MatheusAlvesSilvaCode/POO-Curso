package Polimorfismo;

public class Mamifero extends Animal {
    private String corPelo;
    @Override
    public void locomover() {
        System.out.println("Andando...");

    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");

    }

    @Override
    public void emitirSim() {
        System.out.println("Som de Mamifero...");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
