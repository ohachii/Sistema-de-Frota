public class Veiculos {

    private String placa;
    private String modelo;
    private int anoDeFabricacao;
    private Proprietario proprietario;


    public Veiculos(String placa, String modelo, int anoDeFabricacao, Proprietario proprietario) {

        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    

        if (anoDeFabricacao < 2000) {
            throw new Error("O ano de fabricação não pode ser anterior a 2000.");
        }
        if (placa == null || placa.trim().isEmpty()) {
            throw new Error("Nenhum veículo pode ter placa vazia ou nula.");
        }
    }
    public void exibirDadosDosVeiculos(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
        System.out.println("Proprietário: " + proprietario.getNome());
        System.out.println("Identificador: " + proprietario.getIdentificador());
    }
}