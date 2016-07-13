package aula03.bank;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente {
    
    public String nome;
    private String endereco;
    private String cpf;
    public int idade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
