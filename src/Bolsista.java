public class Bolsista extends HAluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de " + this.getNome());

    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Bolsisita " + this.getNome());
    }

}
