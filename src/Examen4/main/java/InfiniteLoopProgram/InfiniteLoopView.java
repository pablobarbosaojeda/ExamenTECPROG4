package InfiniteLoopProgram;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * La vista para el bucle infinito, una interfaz gráfica que muestra el contador.
 */
public class InfiniteLoopView extends JFrame implements Observer {
    private JLabel countLabel;

    /**
     * Construye una nueva InfiniteLoopView y configura la interfaz gráfica.
     */
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

    /**
     * Actualiza la vista cuando el modelo notifica un cambio en el contador.
     *
     * @param o   El objeto observable (el modelo)
     * @param arg El argumento pasado por el modelo (el nuevo valor del contador)
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof InfiniteLoopModel) {
            InfiniteLoopModel model = (InfiniteLoopModel) o;
            int count = model.getCount();
            updateCount(count);
        }
    }

    /**
     * Actualiza el texto del contador en la vista.
     *
     * @param count El nuevo valor del contador
     */
    private void updateCount(int count) {
        countLabel.setText("Count: " + count);
    }
}
