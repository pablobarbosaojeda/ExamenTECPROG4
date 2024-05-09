package InfiniteLoopProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfiniteLoopControllerTest {

    @Test
    void startCounting() {
        InfiniteLoopModel model = new InfiniteLoopModel();
        InfiniteLoopView view = new InfiniteLoopView();
        InfiniteLoopController controller = new InfiniteLoopController(model, view);
        controller.startCounting();
    }
}
