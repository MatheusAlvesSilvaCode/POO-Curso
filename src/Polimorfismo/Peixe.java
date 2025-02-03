package Polimorfismo;

public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirSim() {
        System.out.println("Peixe nao faz som");
    }
    public void soltarBolhas() {
        System.out.println("Peixe soltar Bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
