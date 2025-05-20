public class Caminhao extends Veiculos {

    private double tonelada;

    public Caminhao(String placa, String modelo, int anoDeFabricacao, double tonelada, Proprietario proprietario) {
        super(placa, modelo, anoDeFabricacao, proprietario);

        this.tonelada = tonelada;

        if (tonelada <= 1000) {
            throw new Error("Caminhões devem ter capacidade de carga mínima de 1 tonelada.");
        }
    }
    public void exibirDadosCaminhao(){
        super.exibirDadosDosVeiculos();
        System.out.println("Tonelada: " + tonelada);
    }
}