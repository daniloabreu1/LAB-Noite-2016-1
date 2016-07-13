package aula03.bank;

/**
 *
 * @author Danilo Abreu
 */
public class TesteConta {

    public static void main(String args[]) {
        System.out.println("Quantidade de Contas: " + Conta.getQtContas());
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Maria Augusta";
        cliente1.setCpf("11122233344");
        cliente1.setEndereco("Rua das Baraúnas");
        cliente1.idade = 21;
        
        ContaCorrente conta1 = new ContaCorrente(cliente1);

        conta1.setNumeroConta(111);
        conta1.setLimite(100);
        conta1.setSaldo(200);
        System.out.printf("Saldo: %.2f\n", conta1.getSaldo());
        conta1.depositarValor(100);
        System.out.printf("Saldo: %.2f\n", conta1.getSaldo());
        conta1.sacarValor(70);
        System.out.printf("Saldo: %.2f\n", conta1.getSaldo());
        conta1.atualizarConta(3);
        System.out.printf("Saldo: %.2f\n", conta1.getSaldo());

        System.out.println("Quantidade de Contas: " + Conta.getQtContas());
    }

}
