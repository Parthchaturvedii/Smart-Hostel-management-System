import javax.swing.*;

public class SearchStudent {
    SearchStudent() {
        JFrame frame = new JFrame("Search Student");

        JLabel label = new JLabel("Enter Name:");
        label.setBounds(50,50,150,30);

        JTextField field = new JTextField();
        field.setBounds(150,50,150,30);

        JButton btn = new JButton("Search");
        btn.setBounds(120,120,100,30);

        frame.add(label);
        frame.add(field);
        frame.add(btn);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);

        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "No DATABASE");
        });
    }
}