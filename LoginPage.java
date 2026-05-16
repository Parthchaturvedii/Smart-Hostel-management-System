import javax.swing.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50,50,100,30);

        JTextField user = new JTextField();
        user.setBounds(150,50,150,30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50,100,100,30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(150,100,150,30);

        JButton btn = new JButton("Login");
        btn.setBounds(120,160,100,30);

        frame.add(userLabel);
        frame.add(user);
        frame.add(passLabel);
        frame.add(pass);
        frame.add(btn);

        frame.setSize(350,300);
        frame.setLayout(null);
        frame.setVisible(true);

        btn.addActionListener(e -> {
            try {
                String u = user.getText();
                String p = new String(pass.getPassword());

                if(u.equals("admin") && p.equals("1234")) {
                    new Dashboard();
                    frame.dispose();
                } else {
                    throw new Exception("Invalid Username/Password");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });
    }
}