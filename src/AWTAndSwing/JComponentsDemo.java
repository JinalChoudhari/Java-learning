package AWTAndSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JComponentsDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration");

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JButton submitButton = new JButton("Submit");

        frame.setLayout(new GridLayout(3, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(ageLabel);
        frame.add(ageField);

        frame.add(new JLabel());
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String age = ageField.getText();

                JOptionPane.showMessageDialog(
                        frame,
                        "Name: " + name +
                                "\nAge: " + age
                );
            }
        });

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
