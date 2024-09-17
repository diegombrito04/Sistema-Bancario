import java.util.Random;

public class Cliente extends Thread {
    private final Banco banco;
    private final Conta conta;
    private final Conta contaLoja1;
    private final Conta contaLoja2;
    private static final Random random = new Random();

    public Cliente(Banco banco, Conta conta, Conta contaLoja1, Conta contaLoja2) {
        this.banco = banco;
        this.conta = conta;
        this.contaLoja1 = contaLoja1;
        this.contaLoja2 = contaLoja2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            fazerCompra(contaLoja1);
            fazerCompra(contaLoja2);
        }
    }

    private void fazerCompra(Conta contaLoja) {
        double valorCompra = 200 + random.nextDouble() * 300;
        if (conta.sacar(valorCompra)) {
            banco.transferir(conta, contaLoja, valorCompra);
        }
    }
}
