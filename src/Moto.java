public class Moto extends Veiculos {

    private int cilindrada;

    public Moto(String placa, String modelo, int anoDeFabricacao, int cilindrada, Proprietario proprietario) {
        super(placa, modelo, anoDeFabricacao, proprietario);

        this.cilindrada = cilindrada;

        if (cilindrada <= 100) {
            throw new Error("Motos devem ter cilindrada mínima de 100cc.");
        }
    }

    public void exibirInformacoesMoto() {
        super.exibirDadosDosVeiculos();
        System.out.println("Cilindrada: " + cilindrada + "cc" );
    }

}