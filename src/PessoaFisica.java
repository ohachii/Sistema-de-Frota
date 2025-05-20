public class PessoaFisica extends Proprietario {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public String getIdentificador() {
        return cpf;  
    }
}