public class Proprietario {
    private String nome;

    public Proprietario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getIdentificador() {
        return "CPF/CNPJ";
    }
}