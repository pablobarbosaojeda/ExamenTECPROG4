package InfiniteLoopProgram;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class InfiniteLoopView extends JFrame implements Observer {
    private JLabel countLabel;

    public InfiniteLoopView() {
        setTitle("Contador Hacia Arriba");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        countLabel = new JLabel("Count: 1");
        panel.add(countLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg){
        if (o instanceof InfiniteLoopModel){
            InfiniteLoopModel model = (InfiniteLoopModel) o;
            int count = model.getCount();
            updateCount(count);
        }
    }

    private void updateCount(int count){
        countLabel.setText("Count: " + count);
    }


}
