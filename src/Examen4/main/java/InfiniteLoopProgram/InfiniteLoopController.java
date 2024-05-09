package InfiniteLoopProgram;

public class InfiniteLoopController {
    private InfiniteLoopModel model;
    private InfiniteLoopView view;

    public InfiniteLoopController(InfiniteLoopModel model, InfiniteLoopView view) {
        this.model = model;
        this.view = view;
        model.addObserver(view); // Registrar la vista como observadora del modelo
    }

    public void startCounting() {
        model.startCounting(); // Iniciar el conteo
    }
}
