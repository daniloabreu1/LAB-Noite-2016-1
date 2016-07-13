package aula03.bank;

/**
 *
 * @author Danilo Abreu
 */
public class TesteConta {
    
    public static void main (String args[]){
        System.out.println("Quantidade de Contas: "+Conta.getQtContas());
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Maria Augusta";
        cliente1.setCpf("11122233344");
        cliente1.setEndereco("Rua das Baraúnas");
        cliente1.idade=21;
        
        Conta conta1 = new Conta(cliente1);
        conta1.setNumeroConta(111);
        conta1.setLimite(100);
        conta1.setSaldo(200);
        
        Conta conta2 = new Conta(cliente1);
        conta2.setNumeroConta(112);
        conta2.setLimite(1000);
        conta2.setSaldo(2000);
        
        
        System.out.println("Cliente: "+conta1.getTitular());
        System.out.println("Conta: "+conta1.getNumeroConta());
        System.out.println("Saldo: "+conta1.getSaldo());
        System.out.println("Limite: "+conta1.getLimite());
        
        System.out.println("Cliente: "+conta2.getTitular());
        System.out.println("Conta: "+conta2.getNumeroConta());
        System.out.println("Saldo: "+conta2.getSaldo());
        System.out.println("Limite: "+conta2.getLimite());
        
        System.out.println("Quantidade de Contas: "+Conta.getQtContas());
    }
    
}
