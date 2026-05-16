import javax.swing.*;

public class AllocateRoom {
    AllocateRoom() {
        JFrame frame = new JFrame("Allocate Room");

        JLabel label = new JLabel("Enter Student Name:");
        label.setBounds(50,50,150,30);

        JTextField field = new JTextField();
        field.setBounds(180,50,120,30);

        JButton btn = new JButton("Allocate");
        btn.setBounds(120,120,100,30);

        frame.add(label);
        frame.add(field);
        frame.add(btn);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);

        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Room Allocated! BUT no STORAGE DUE TO DATABASE");
        });
    }
}