public class Funcionario extends Thread {
    private final Conta contaSalario;
    private final Conta contaInvestimento;
    private static final double SALARIO = 1400.0;

    public Funcionario(Conta contaSalario, Conta contaInvestimento) {
        this.contaSalario = contaSalario;
        this.contaInvestimento = contaInvestimento;
    }

    @Override
    public void run() {
        try {
            sleep(2000); // Simula o tempo para receber o salário
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contaSalario.depositar(SALARIO);
        double investimento = SALARIO * 0.2;
        contaSalario.sacar(SALARIO);
        contaInvestimento.depositar(investimento);
    }
}
