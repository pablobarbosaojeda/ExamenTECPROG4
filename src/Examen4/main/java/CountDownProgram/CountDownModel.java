package CountDownProgram;
import java.util.Observable
public class CountDownModel extends Observable {
    private int count;

    public CountDownModel(int count) {
        this.count = initialCount;

    }

    public void countDown() {
        if (count > 0) {
            count--;
            setChanged();
            notifyObservers(count);
        }
    }
    public boolean isFinished() {
        return count == 0;
    }
}
