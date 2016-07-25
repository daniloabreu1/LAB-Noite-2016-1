package aula05.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo Abreu
 */
public class TesteAutenticar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente f = new Gerente();
        f.setSenha(123);
        
        Cliente c = new Cliente();
        c.setSenha(567);
        
        SistemaInterno si = new SistemaInterno();
        si.loginUsuario(f, 123);
        si.loginUsuario(c, 567);
        
        
    }
    
}
