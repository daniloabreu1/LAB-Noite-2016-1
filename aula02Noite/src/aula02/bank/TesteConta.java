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
        Cliente c1 = new Cliente();
        c1.nome="Maria Clara";
        c1.setCpf("11122233344");
        c1.setEndereco("Rua das Baraúnas");
        c1.idade=20;
        
        Conta conta1 = new Conta();
        conta1.setNumeroConta(1);
        conta1.setLimite(1000);
        conta1.setSaldo(500);
        conta1.setTitular(c1);
        
        System.out.println("Cliente: "+conta1.getTitular());
        System.out.println("Conta: "+conta1.getNumeroConta());
        System.out.println("Saldo: "+conta1.getSaldo());
        System.out.println("Limite: "+conta1.getLimite());
    }
    
}
