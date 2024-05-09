package CountDownProgram;

import java.util.Observable;

/**
 * La clase del modelo para la cuenta regresiva. Mantiene un contador y notifica
 * a los observadores sobre los cambios en el contador.
 */
public class CountDownModel extends Observable {
    private int count;

    /**
     * Construye un nuevo CountDownModel con el contador inicial dado.
     *
     * @param initialCount El contador inicial
     */
    public CountDownModel(int initialCount) {
        this.count = initialCount;
    }

    /**
     * Realiza un conteo regresivo decrementando el contador en 1.
     * Notifica a los observadores sobre el nuevo valor del contador.
     */
    public void countDown() {
        if (count > 0) {
            count--;
            setChanged();
            notifyObservers(count); // Notificar a los observadores el nuevo valor del contador
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

    /**
     * Comprueba si el conteo ha terminado (el contador es 0).
     *
     * @return true si el contador es 0, false de lo contrario
     */
    public boolean isFinished() {
        return count == 0;
    }
}
