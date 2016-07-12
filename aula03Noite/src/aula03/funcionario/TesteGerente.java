/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.funcionario;

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
        f1.autenticarSenha(12345);
        
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Salario: "+f1.getSalario());
        System.out.println("Bonificacao "+f1.getBonificacao());
    }
    
}
