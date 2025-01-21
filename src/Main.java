public class Main {
    public static void main(String[] args) {
      visitante v1 = new visitante();
      v1.setNome("Vinicius");
      v1.setIdade(29);
      v1.setSexo("Masculino");
        System.out.println(v1.toString());


        System.out.println(v1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("jubileu");
        b1.setIdade(2895);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}