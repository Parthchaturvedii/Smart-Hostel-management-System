import javax.swing.*;

public class RemoveStudent {
    RemoveStudent() {
        JFrame frame = new JFrame("Remove Student");

        JLabel label = new JLabel("Enter Student ID:");
        label.setBounds(50,50,150,30);

        JTextField field = new JTextField();
        field.setBounds(180,50,120,30);

        JButton btn = new JButton("Remove");
        btn.setBounds(120,120,100,30);

        frame.add(label);
        frame.add(field);
        frame.add(btn);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);

        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "NO DATABASE");
        });
    }
}