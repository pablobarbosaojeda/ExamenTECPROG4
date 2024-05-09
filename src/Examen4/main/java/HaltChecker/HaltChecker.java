package HaltChecker;

import javax.swing.*;

/**
 * Esta clase representa una aplicación simple llamada Halt Checker que muestra información sobre
 * el estado de dos programas diferentes.
 */
public class HaltChecker extends JFrame {

    /**
     * Constructor de la clase HaltChecker. Configura la interfaz gráfica y muestra información sobre
     * los programas.
     */
    public HaltChecker() {
        setTitle("Halt Checker"); // Establecer el título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana

        JPanel panel = new JPanel(); // Crear un panel para organizar los componentes
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Establecer el diseño del panel

        // Etiquetas que muestran información sobre los programas
        JLabel countDownLabel = new JLabel("CountDownProgram se detiene.");
        JLabel spaceLabel = new JLabel(" "); // Etiqueta vacía para agregar espacio
        JLabel infiniteLoopLabel = new JLabel("InfiniteLoopProgram no se detiene (bucle infinito).");

        // Agregar las etiquetas al panel
        panel.add(countDownLabel);
        panel.add(spaceLabel);
        panel.add(infiniteLoopLabel);

        // Agregar el panel a la ventana
        add(panel);
        pack(); // Ajustar el tamaño de la ventana automáticamente
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true); // Hacer visible la ventana

        // Verificar el estado de los programas
        verificarProgramas();
    }

    /**
     * Método principal que crea una instancia de HaltChecker y la muestra en el hilo de eventos de Swing.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {
        // Crear y mostrar la ventana en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HaltChecker();
            }
        });
    }

    /**
     * Método que simula la funcionalidad de HaltChecker al verificar si los programas se detienen o no.
     */
    private void verificarProgramas() {
        // Simular la verificación del programa CountDownProgram
        int entradaCountDown = 10; // Entrada específica para CountDownProgram
        boolean seDetieneCountDown = (entradaCountDown == 0); // Verificar si CountDownProgram se detiene

        // Simular la verificación del programa InfiniteLoopProgram
        // Dado que InfiniteLoopProgram es un bucle infinito, no se detendrá nunca
        boolean seDetieneInfiniteLoop = false;

        // Actualizar las etiquetas según los resultados de la verificación
        JLabel countDownLabel = (JLabel) getContentPane().getComponent(0);
        JLabel infiniteLoopLabel = (JLabel) getContentPane().getComponent(2);

        countDownLabel.setText("CountDownProgram se detiene: " + seDetieneCountDown);
        infiniteLoopLabel.setText("InfiniteLoopProgram se detiene: " + seDetieneInfiniteLoop);
    }
}
