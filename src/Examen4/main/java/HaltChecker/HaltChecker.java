package HaltChecker;

import javax.swing.*;

/**
 * Esta clase representa un programa simple llamado Halt Checker que muestra
 * información sobre el estado de dos programas diferentes: CountDownProgram e
 * InfiniteLoopProgram.
    * <p>
 * Conclusiones:
 * Como parte de este ejercicio, he explorado el concepto
 * de detección de parada en programas de computadora. A través de esta simulación,
 * he reflexionado sobre la indecidibilidad del problema de parada y cómo podemos
 * simular su funcionalidad mediante la evaluación de condiciones específicas en
 * los programas.
 * <p>
 * Además, he discutido cómo la capacidad de determinar si un programa se
 * detendrá o continuará ejecutándose es esencial en el desarrollo de software,
 * especialmente en sistemas críticos y aplicaciones donde la estabilidad y
 * el rendimiento son fundamentales.
 * <p>
 * Esta experiencia me ha llevado a considerar las complejidades inherentes en
 * la predicción del comportamiento de los programas, y cómo incluso problemas
 * aparentemente simples pueden volverse intratables cuando se analizan en profundidad.
 * <p>
 * A través de este ejercicio, también he reconocido la importancia de la
 * prueba rigurosa y la validación del software para garantizar que funcione
 * según lo esperado y se comporte de manera predecible en una variedad de
 * situaciones y condiciones.
 *
 * @see CountDownProgram
 * @see InfiniteLoopProgram
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

