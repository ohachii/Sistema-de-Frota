public class PessoaJuridica extends Proprietario {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return this.cnpj;
    }

    public String getIdentificador() {
        return cnpj;  
    }
}