package CountDownProgram;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * La vista para la cuenta regresiva, una interfaz gráfica que muestra el contador.
 */
public class CountDownView extends JFrame implements Observer {
    private JLabel countLabel;

    /**
     * Construye una nueva CountDownView y configura la interfaz gráfica.
     */
    public CountDownView() {
        setTitle("Cuenta Regresiva");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        countLabel = new JLabel("Contador: 0 ");
        panel.add(countLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Actualiza la vista cuando el modelo notifica un cambio en el contador.
     *
     * @param o   El objeto observable (el modelo)
     * @param arg El argumento pasado por el modelo (el nuevo valor del contador)
     */
    public void update(Observable o, Object arg) {
        if (o instanceof CountDownModel) {
            CountDownModel model = (CountDownModel) o;
            int count = model.getCount();
            updateCount(count);
        }
    }

    /**
     * Actualiza el texto del contador en la vista.
     *
     * @param count El nuevo valor del contador
     */
    public void updateCount(int count) {
        countLabel.setText("Contador: " + count);
    }
}
