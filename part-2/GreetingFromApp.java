import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingFromApp extends JFrame implements ActionListener {
    private JTextField nameFeild;
    private JButton greetButton;
    private JLabel messageLabel;
    public GreetingFromApp() {
        setTitle("Greeting From ");
        nameFeild = new JTextField(15);
        greetButton = new JButton("Greet");
        messageLabel= new JLabel("Enter your name and press Greet", SwingConstants.CENTER);
        greetButton.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameFeild);
        panel.add(greetButton);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GreetingFromApp().setVisible(true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameFeild.getText().trim();
        if (name.isEmpty()) {
            messageLabel.setText("Please enter your name");
        }else {
            messageLabel.setText("Hello"+name + "!");
        }

    }
}
