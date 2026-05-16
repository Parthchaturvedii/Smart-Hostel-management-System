import javax.swing.*;

public class Dashboard {
    Dashboard() {
        JFrame frame = new JFrame("Dashboard");

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(80,30,200,40);

        JButton removeBtn = new JButton("Remove Student");
        removeBtn.setBounds(80,80,200,40);

        JButton roomBtn = new JButton("Allocate Room");
        roomBtn.setBounds(80,130,200,40);

        JButton searchBtn = new JButton("Search Student");
        searchBtn.setBounds(80,180,200,40);

        frame.add(addBtn);
        frame.add(removeBtn);
        frame.add(roomBtn);
        frame.add(searchBtn);

        frame.setSize(350,300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Navigation
        addBtn.addActionListener(e -> new Studentform());
        removeBtn.addActionListener(e -> new RemoveStudent());
        roomBtn.addActionListener(e -> new AllocateRoom());
        searchBtn.addActionListener(e -> new SearchStudent());
    }
}