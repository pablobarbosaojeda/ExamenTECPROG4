package InfiniteLoopProgram;

import java.util.Observable;

import java.util.Observable;

/**
 * La clase del modelo para el bucle infinito. Mantiene un contador que aumenta
 * infinitamente y notifica a los observadores sobre los cambios en el contador.
 */
public class InfiniteLoopModel extends Observable {
    private int count;

    private static InfiniteLoopModel instance;

    public InfiniteLoopModel() {
        count = -1;
    }

    /**
     * Obtiene una instancia única del modelo (patrón Singleton).
     *
     * @return La instancia del modelo
     */
    public static synchronized InfiniteLoopModel getInstance() {
        if (instance == null) {
            instance = new InfiniteLoopModel();
        }
        return instance;
    }

    /**
     * Inicia el conteo del bucle infinito. Incrementa el contador infinitamente
     * y notifica a los observadores sobre el nuevo valor del contador.
     */
    public void startCounting() {
        while (true) {
            count++;
            setChanged();
            notifyObservers(count);
            try {
                Thread.sleep(1000); // Agrega un pequeño delay para visualizar el conteo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Obtiene el valor actual del contador.
     *
     * @return El valor del contador
     */
    public int getCount() {
        return count;
    }
}
