package CountDownProgram;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
public class CountDownView extends JFrame implements Observer{
    private JLabel label;
    public CountDownView(){
        setTitle("Count Down");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        countLabel = new JLabel("Count: 0 ");
        panel.add(countLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void update(Observable o, Object arg){
        if (o instanceof CountDownModel){
            CountDownModel model = (CountDownModel) o;
            int count = model.getCount();
            updateCount(count);
        }
    }

    public void updateCount(int count){
        countLabel.setText("Count: " + count);
    }
}
