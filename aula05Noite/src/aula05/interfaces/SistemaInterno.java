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
public class SistemaInterno {
    
    public void loginUsuario(Autentificavel a, int senha){
        if(a.autentificarUsuario(senha)){
            System.out.println("Login Realizado");
        }else{
            System.out.println("Login não Realizado");
        }
    }
    
}
