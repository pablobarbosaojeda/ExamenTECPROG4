package CountDownProgram;
import java.util.Observable;
public class CountDownModel extends Observable {
    private int count;

    public CountDownModel(int initialCount) {
        this.count = initialCount;

    }

    public void countDown() {
        if (count > 0) {
            count--;
            setChanged();
            notifyObservers(count); //Notificar a los observadores el nuevo valor del contador
        }
    }
   public int getCount() {
        return count;
    }
}
