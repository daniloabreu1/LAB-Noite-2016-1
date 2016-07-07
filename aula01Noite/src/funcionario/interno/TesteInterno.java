package funcionario.interno;

import java.util.Scanner;

/**
 *
 * @author Danilo Abreu
 */
public class TesteInterno {

    public static void main(String[] args) {
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
        System.out.print("Senha: ");
        f.senha=s.next();
        System.out.print("Férias: ");
        f.ferias=s.nextBoolean();
        System.out.println("");
        System.out.println("Nome: "+f.nome);
        System.out.println("CPF: "+f.getCpf());
        System.out.println("Salario: "+f.getSalario());
        System.out.println("Código: "+f.getCodigoFuncionario());
        System.out.println("Senha: "+f.senha);
        System.out.println("Férias: "+f.ferias);
        
    }
    
}
