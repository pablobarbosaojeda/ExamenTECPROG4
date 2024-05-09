package InfiniteLoopProgram;
import java.util.Observable;
public class InfiniteLoopModel extends Observable{
    private int count;

    private static InfiniteLoopModel instance;

    private InfiniteLoopModel(){
        count = -1;
    }

    public static synchronized InfiniteLoopModel getInstance(){
        if(instance == null){
            instance = new InfiniteLoopModel();
        }
        return instance;
    }

    public void startCounting(){
        while (true){
            count++;
            setChanged();
            notifyObservers(count);
            try{
                Thread.sleep(1000); //Agrega un pequeño delay para visualizar el conteo
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public int getCount(){
        return count;
    }
}
