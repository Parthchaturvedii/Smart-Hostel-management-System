import javax.swing.*;

public class Studentform {
    Studentform() {
        JFrame frame = new JFrame("Student Form");

        JLabel label = new JLabel("Enter Name:");
        label.setBounds(50,50,100,30);

        JTextField field = new JTextField();
        field.setBounds(150,50,150,30);

        JButton save = new JButton("Save");
        save.setBounds(120,120,100,30);

        frame.add(label);
        frame.add(field);
        frame.add(save);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);

        save.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Saved!");
        });
    }
}

