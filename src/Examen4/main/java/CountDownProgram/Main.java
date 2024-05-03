package CountDownProgram;

public class Main {
    public static void main(String[] args) {
        CountDownModel model = new CountDownModel(10);
        CountDownView view = new CountDownView();
        CountDownController controller = new CountDownController(model, view);

        controller.startCounting();
    }
}
