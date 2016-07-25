package aula05.interfaces;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente implements Autentificavel {
    
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
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
