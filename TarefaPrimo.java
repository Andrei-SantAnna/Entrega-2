import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class TarefaPrimo implements Runnable {
    private final List<Integer> numeros;
    private final boolean[] resultados;
    private final int inicio, fim;
    private final ReentrantLock lock;

    public TarefaPrimo(List<Integer> numeros, boolean[] resultados, int inicio, int fim, ReentrantLock lock) {
        this.numeros = numeros;
        this.resultados = resultados;
        this.inicio = inicio;
        this.fim = fim;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fim; i++) {
            boolean primo = VerificadorPrimo.ePrimo(numeros.get(i));
            lock.lock();
            try {
                resultados[i] = primo;
            } finally {
                lock.unlock();
            }
        }
    }
}
