package aula03.bank;

/**
 *
 * @author Danilo Abreu
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public void atualizarConta(double taxa) {
        System.out.printf("Taxa: %.2f\n", (((taxa / 100) * this.getSaldo()) * 2));
        this.setSaldo(this.getSaldo() - ((taxa / 100) * this.getSaldo()) * 2);
    }

    public void depositarValor(double valor) {
        this.setSaldo(this.getSaldo() + valor - 0.10);
    }
}
