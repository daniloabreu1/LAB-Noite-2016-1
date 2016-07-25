/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.interfaces;

/**
 *
 * @author Danilo Abreu
 */
public class Gerente extends Funcionario implements Autentificavel {

    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }

    @Override
    public boolean autentificarUsuario(int senha) {
        if (this.getSenha() == senha) {
            return true;
        } else {
            return false;
        }
    }
}
