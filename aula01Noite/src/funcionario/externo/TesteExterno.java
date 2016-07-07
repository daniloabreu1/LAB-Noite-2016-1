/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario.externo;

import funcionario.interno.Funcionario;
import java.util.Scanner;

/**
 *
 * @author Danilo Abreu
 */
public class TesteExterno {
    
    public static void main(String args[]){
        Funcionario f = new Funcionario();
        Scanner s = new Scanner(System.in);
        System.out.print("Nome: ");
        f.nome = s.nextLine();
        System.out.print("CPF: ");
        f.setCpf(s.next());
        System.out.print("Salario: ");
        f.setSalario(s.nextDouble());
        System.out.print("Código: ");
        f.setCodigoFuncionario(s.next());
        //System.out.print("Senha: ");
        //f.senha=s.next(); Não consegue usar
        //System.out.print("Férias: ");
        //f.ferias=s.nextBoolean();
        System.out.println("");
        System.out.println("Nome: "+f.nome);
        System.out.println("CPF: "+f.getCpf());
        System.out.println("Salario: "+f.getSalario());
        System.out.println("Código: "+f.getCodigoFuncionario());
        //System.out.println("Senha: "+f.senha);
        //sSystem.out.println("Férias: "+f.ferias);
    }
}
