import java.util.concurrent.locks.ReentrantLock;

public class Banco {
    private final ReentrantLock lock = new ReentrantLock();

    public void transferir(Conta origem, Conta destino, double valor) {
        lock.lock();
        try {
            if (origem.sacar(valor)) {
                destino.depositar(valor);
            }
        } finally {
            lock.unlock();
        }
    }
}
