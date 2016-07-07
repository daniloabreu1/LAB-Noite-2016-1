
package funcionario.interno;

/**
 *
 * @author Danilo Abreu
 */
public class Funcionario {
    
    public String nome;
    private String cpf;
    private double salario;
    private String codigoFuncionario;
    protected String senha;
    boolean ferias;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public boolean isFerias() {
        return ferias;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
    
    
}
