public class Carro extends Veiculos {
    private int portas;
    private String combustivel;

    public Carro(String placa, String modelo, int anoDeFabricacao, int portas, String combustivel, Proprietario proprietario) {
        super(placa, modelo, anoDeFabricacao, proprietario);

        this.portas = portas;
        this.combustivel = combustivel;

        if (portas <= 2) {
            throw new Error("Carros devem ter no mínimo 2 portas.");
        }
    }
    public void exibirInformacoesCarro(){
        exibirDadosDosVeiculos();
        System.out.println("Quantidade de portas: " + portas);
        System.out.println("Combustível: " + combustivel);

    }

}