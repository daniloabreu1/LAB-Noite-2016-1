/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.bank;

/**
 *
 * @author Danilo Abreu
 */
public class Conta {

    private int numeroConta;
    private double saldo;
    private double limite;
    private Cliente titular;
    private static int qtContas = 0;

    public Conta() {

    }

    public Conta(Cliente titular) {
        this.setTitular(titular);
        qtContas++;
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

    public static int getQtContas() {
        return qtContas;
    }
    
    public void depositarValor(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }
    
    public void sacarValor(double valor){
        this.setSaldo(this.getSaldo()-valor);
    }
    
    public void atualizarConta(double taxa){
        this.setSaldo(this.getSaldo()-((taxa/100)*this.getSaldo()));
    }
}
