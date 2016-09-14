/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.execoes;

import java.util.InputMismatchException;

/**
 *
 * @author Danilo Abreu
 */
public class Calculadora {
    
    public float dividir(int numerador, int denominador){
        try{
          return numerador/denominador;
    }catch (ArithmeticException e){
            System.out.println(""+e.getMessage());
            return -1;
    }
    }
}
