package CountDownProgram;

public class CountDownController {
    private CountDownModel model;
    private CountDownView view;

    public CountDownController(CountDownModel model, CountDownView view){
        this.model = model;
        this.view = view;
        model.addObserver(view); //Registrar la vista como observadora del modelo
    }

    public void startCounting(){
        while(model.getCount() > 0){
            model.countDown();
            try {
                Thread.sleep(1000); //Esperar 1 segundo entre cada interración
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
