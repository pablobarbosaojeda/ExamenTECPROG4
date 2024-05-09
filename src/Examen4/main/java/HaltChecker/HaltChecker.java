package HaltChecker;

import javax.swing.*;

public class HaltChecker extends JFrame {

    public HaltChecker() {
        setTitle("Halt Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel countDownLabel = new JLabel("CountDownProgram se detiene.");
        JLabel spaceLabel = new JLabel(" ");
        JLabel infiniteLoopLabel = new JLabel("InfiniteLoopProgram no se detiene (bucle infinito).");

        panel.add(countDownLabel);
        panel.add(spaceLabel);
        panel.add(infiniteLoopLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HaltChecker();
            }
        });
    }
}
