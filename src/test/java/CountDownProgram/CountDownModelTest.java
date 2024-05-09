package CountDownProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDownModelTest {

    @Test
    void countDown() {
        CountDownModel model = new CountDownModel(10);
        model.countDown();
        assertEquals(9, model.getCount());
    }

    @Test
    void getCount() {
    }
}
