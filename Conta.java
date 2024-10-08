public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
    }

    public synchronized double getSaldo() {
        return saldo;
    }
}
