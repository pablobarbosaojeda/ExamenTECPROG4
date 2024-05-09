package CountDownProgram;

import org.junit.jupiter.api.Test;


class CountDownControllerTest {

    @Test
    void startCounting() {
        CountDownModel model = new CountDownModel(10);
        CountDownView view = new CountDownView();
        CountDownController controller = new CountDownController(model, view);
        controller.startCounting();
    }
}
