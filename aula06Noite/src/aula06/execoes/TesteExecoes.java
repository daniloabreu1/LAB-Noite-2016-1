package aula06.execoes;

/**
 *
 * @author Danilo Abreu
 */
public class TesteExecoes {
    static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }
    static void metodo2(){
        System.out.println("Inicio do metodo 2");
        int[] vetor= new int[6];
        try{
        for(int i=0;i<=7;i++){
            vetor[i] = i;
            System.out.println(vetor[i]);
        }
        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
        }finally{
            System.out.println("Fim do metodo 2");
        }
        
    }
    public static void main(String args[]){
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    
}
