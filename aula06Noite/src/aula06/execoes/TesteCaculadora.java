package aula06.execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Danilo Abreu
 */
public class TesteCaculadora {

    public static void main(String args[]) {
        int n, d;
        Calculadora c = new Calculadora();
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("DIGITE O NUMERADOR: ");
            n = s.nextInt();
            System.out.print("DIGITE O DENOMINADOR: ");
            d = s.nextInt();
            System.out.println("RESULTADO: " + c.dividir(n, d));
            System.out.println("Digite um inteiro");
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
            
        }

    }
