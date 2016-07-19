/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.polimorfismo;

/**
 *
 * @author Danilo Abreu
 */
public class ControleBonificacao {
    
    private double totalBonificacoes =0;
    
    public void setBonificacao(Funcionario f){
        this.totalBonificacoes+=f.getBonificacao();
    }
    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
}
