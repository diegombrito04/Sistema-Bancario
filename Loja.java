public class Loja {
    private final Conta conta;
    private final Funcionario[] funcionarios;

    public Loja(Conta conta, Funcionario[] funcionarios) {
        this.conta = conta;
        this.funcionarios = funcionarios;
    }

    public void processarPagamento(double valor) {
        conta.depositar(valor);
    }

    public void pagarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (conta.getSaldo() >= 1400) {
                conta.sacar(1400);
                funcionario.start();
            }
        }
    }
}
