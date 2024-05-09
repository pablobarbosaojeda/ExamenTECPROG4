package Reverser;

import javax.swing.*;

/**
 * Esta clase representa una aplicación simple llamada Reverser que muestra información sobre
 * el estado de dos programas diferentes.
 */

/**
 * Conclusiones:
 * Reverser toma el código de un programa y lo usa como entrada para ese mismo
 * programa. Si HaltChecker indica que el programa se detendrá, entonces Reverser
 * entra en un bucle infinito; si indica que no se detendrá, entonces Reverser
 * termina inmediatamente.
 * <p>
 * Al desarrollar Reverser, he obtenido una perspectiva interesante sobre cómo
 * podemos manipular el flujo de ejecución de un programa en función de condiciones
 * externas. A través de este ejercicio, he explorado cómo podemos utilizar la
 * información sobre la parada de programas para controlar el comportamiento
 * de otros programas de manera dinámica.
 * <p>
 * En particular, he reflexionado sobre cómo esta capacidad podría ser útil en
 * situaciones donde necesitamos adaptar el comportamiento de un sistema en tiempo
 * real en respuesta a cambios en su entorno o condiciones imprevistas.
 * <p>
 * Además, he considerado las implicaciones éticas y de seguridad de este tipo
 * de manipulación de software, reconociendo la necesidad de garantizar que estas
 * técnicas se utilicen de manera responsable y ética, especialmente en aplicaciones
 * críticas para la seguridad y la integridad de los sistemas y datos.
 *
 * @see HaltChecker
 * @see HaltChecker# determinarParada(String)
 */


public class Reverser extends JFrame {

    /**
     * Constructor de la clase Reverser. Configura la interfaz gráfica y muestra información sobre
     * los programas.
     */
    public Reverser() {
        setTitle("Reverser"); // Establecer el título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana

        JPanel panel = new JPanel(); // Crear un panel para organizar los componentes
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Establecer el diseño del panel

        // Etiquetas que muestran información sobre los programas
        JLabel countDownLabel = new JLabel("CountDownProgram no se detiene.");
        JLabel spaceLabel = new JLabel(" "); // Etiqueta vacía para agregar espacio
        JLabel infiniteLoopLabel = new JLabel("InfiniteLoopProgram se detiene.");

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
     * Método principal que crea una instancia de Reverser y la muestra en el hilo de eventos de Swing.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {
        // Crear y mostrar la ventana en el hilo de eventos de Swing
        SwingUtilities.invokeLater(Reverser::new);
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

