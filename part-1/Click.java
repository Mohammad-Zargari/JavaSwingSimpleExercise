import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Click extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    private int count =0;
    public Click() {
        setTitle("Click Counter");
        label = new JLabel("Clicks : 0" , SwingConstants.CENTER);
        button = new JButton("Click Me");
        button.addActionListener(this);
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Click().setVisible(true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Clicks : " + count);
    }
}
