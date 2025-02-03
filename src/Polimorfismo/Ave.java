package Polimorfismo;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo sementes...");
    }

    @Override
    public void emitirSim() {
        System.out.println("Cantando...");
    }

    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
