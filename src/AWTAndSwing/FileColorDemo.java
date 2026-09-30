package AWTAndSwing;
import javax.swing.*;
import java.awt.*;
import java.io.File;
public class FileColorDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("File and Color Demo");

        JPanel panel = new JPanel();

        JButton fileButton = new JButton("Choose File");
        JButton colorButton = new JButton("Choose Color");

        panel.add(fileButton);
        panel.add(colorButton);

        frame.setLayout(new BorderLayout());

        frame.add(panel, BorderLayout.CENTER);

        // File chooser
        fileButton.addActionListener(e -> {

            JFileChooser chooser = new JFileChooser();

            int result = chooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {

                File file = chooser.getSelectedFile();

                JOptionPane.showMessageDialog(
                        frame,
                        "Selected file:\n" + file.getAbsolutePath()
                );
            }
        });

        // Color chooser
        colorButton.addActionListener(e -> {

            Color color = JColorChooser.showDialog(
                    frame,
                    "Choose Background Color",
                    Color.WHITE
            );

            if (color != null) {
                frame.getContentPane().setBackground(color);
            }
        });

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
