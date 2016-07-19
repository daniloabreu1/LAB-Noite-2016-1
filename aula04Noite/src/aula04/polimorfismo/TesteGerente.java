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
public class TesteGerente {
    
    public static void main(String args[]){
        Gerente f1 = new Gerente();
        f1.setNome("Pedro Ivo");
        f1.setCpf("11122233344");
        f1.setSalario(1000);
       
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Maria Augusta");
        f2.setSalario(1000);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.setBonificacao(f1);
        System.out.println("Total Bonificação: "+controle.getTotalBonificacoes());
        controle.setBonificacao(f2);
        System.out.println("Total Bonificação: "+controle.getTotalBonificacoes());
    }
    
}
