
package aula04.polimorfismo;

/**
 *
 * @author Danilo Abreu
 */
public class Gerente extends Funcionario{
    
    int senha = 12345;
    
    public boolean autenticarSenha(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }
    
    public double getBonificacao(){
        return this.getSalario()*0.15;
    }
}
