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
public class Conta {
    
    private int numeroConta;
    private double saldo;
    private double limite;
    private Cliente titular;
    public static int qtConta=0;
      
    public Conta(Cliente titular){
          this.setTitular(titular);
          qtConta++;
        
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTitular() {
        return titular.nome;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getQtConta() {
        return qtConta;
    }
    
}
