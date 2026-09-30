package AWTAndSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Event Demo");

        JLabel label = new JLabel(
                "Click or type something",
                SwingConstants.CENTER
        );

        frame.add(label);

        // Mouse event
        frame.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                label.setText(
                        "Mouse clicked at X=" +
                                e.getX() +
                                ", Y=" +
                                e.getY()
                );
            }
        });

        // Keyboard event
        frame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                label.setText(
                        "Key pressed: " +
                                e.getKeyChar()
                );
            }
        });

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.setVisible(true);
        frame.requestFocusInWindow();
    }
}
