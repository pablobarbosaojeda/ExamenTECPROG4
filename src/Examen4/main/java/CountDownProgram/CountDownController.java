package CountDownProgram;

/**
 * Clase controladora para el programa de cuenta regresiva. Controla el proceso de cuenta regresiva
 * e interactúa entre el modelo y la vista.
 */
public class CountDownController {
    private CountDownModel model;
    private CountDownView view;

    /**
     * Construye un nuevo CountDownController con el modelo y la vista dados.
     * Registra la vista como observadora del modelo.
     *
     * @param model El modelo de la cuenta regresiva
     * @param view  La vista de la cuenta regresiva
     */
    public CountDownController(CountDownModel model, CountDownView view) {
        this.model = model;
        this.view = view;
        model.addObserver(view); // Registrar la vista como observadora del modelo
    }

    /**
     * Inicia el conteo regresivo. Mientras el contador del modelo sea mayor que 0,
     * se decrementa el contador del modelo y se duerme el hilo durante 1 segundo.
     */
    public void startCounting() {
        while (model.getCount() > 0) {
            model.countDown();
            try {
                Thread.sleep(1000); // Esperar 1 segundo entre cada iteración
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
