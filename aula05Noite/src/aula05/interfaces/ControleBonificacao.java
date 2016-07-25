package aula05.interfaces;

/**
 *
 * @author Danilo Abreu
 */
public class ControleBonificacao {
    private double totalBonificacoes =0;
    
    public void registrar(Funcionario f){
        this.totalBonificacoes+= f.getBonificacao();
    }
    public double getBonificacoes(){
          return this.totalBonificacoes;
    }
}
