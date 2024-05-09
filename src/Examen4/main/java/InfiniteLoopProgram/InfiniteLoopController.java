package InfiniteLoopProgram;

/**
 * Clase controladora para el programa de bucle infinito. Controla el proceso de conteo
 * y actúa como intermediario entre el modelo y la vista.
 */
public class InfiniteLoopController {
    private InfiniteLoopModel model;
    private InfiniteLoopView view;

    /**
     * Construye un nuevo InfiniteLoopController con el modelo y la vista dados.
     * Registra la vista como observadora del modelo.
     *
     * @param model El modelo del bucle infinito
     * @param view  La vista del bucle infinito
     */
    public InfiniteLoopController(InfiniteLoopModel model, InfiniteLoopView view) {
        this.model = model;
        this.view = view;
        model.addObserver(view); // Registrar la vista como observadora del modelo
    }

    /**
     * Inicia el conteo del bucle infinito.
     */
    public void startCounting() {
        model.startCounting(); // Iniciar el conteo
    }
}
