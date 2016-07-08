/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.bank;

/**
 *
 * @author Danilo Abreu
 */
public class TesteConta {
    
    public static void main(String args[]){
        System.out.println("Quantidade de Contas: "+Conta.getQtConta());
        
        Cliente c1 = new Cliente();
        c1.nome="Maria Clara";
        c1.setCpf("11122233344");
        c1.setEndereco("Rua das Baraúnas");
        c1.idade=20;
        
        Conta conta1 = new Conta(c1);
        conta1.setNumeroConta(1);
        conta1.setLimite(1000);
        conta1.setSaldo(500);
         
        System.out.println("Cliente: "+conta1.getTitular());
        System.out.println("Conta: "+conta1.getNumeroConta());
        System.out.println("Saldo: "+conta1.getSaldo());
        System.out.println("Limite: "+conta1.getLimite());
        System.out.println("Quantidade de Contas: "+Conta.getQtConta());
        
        Conta conta2 = new Conta(c1);
        System.out.println("Quantidade de Contas: "+Conta.getQtConta());
    }
    
}
