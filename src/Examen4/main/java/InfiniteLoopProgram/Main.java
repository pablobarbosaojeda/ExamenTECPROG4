package InfiniteLoopProgram;

public class Main {
    public static void main(String[] args) {
        // Crear el modelo, la vista y el controlador
        InfiniteLoopModel model = InfiniteLoopModel.getInstance();
        InfiniteLoopView view = new InfiniteLoopView();
        InfiniteLoopController controller = new InfiniteLoopController(model, view);

        // Iniciar el conteo
        controller.startCounting();
    }
}

