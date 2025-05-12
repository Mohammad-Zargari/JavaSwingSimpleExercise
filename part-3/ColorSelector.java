import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelector extends JFrame implements ActionListener {
    public JPanel main;
    public JButton red;
    public JButton green;
    public JButton blue;
    public JButton yellow;
    public JButton orange;
    public JButton cyan;
    public ColorSelector() {
        setTitle("Theme Color Selector");

        main = new JPanel();

        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        yellow = new JButton("Yellow");
        orange = new JButton("Orange");
        cyan = new JButton("Cyan");

        red.setActionCommand("RED");
        green.setActionCommand("GREEN");
        blue.setActionCommand("BLUE");
        yellow.setActionCommand("YELLOW");
        orange.setActionCommand("ORANGE");
        cyan.setActionCommand("CYAN");

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        orange.addActionListener(this);
        cyan.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(red);
        buttonPanel.add(green);
        buttonPanel.add(blue);
        buttonPanel.add(yellow);
        buttonPanel.add(orange);
        buttonPanel.add(cyan);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(main, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":   main.setBackground(Color.red);   break;
            case "GREEN": main.setBackground(Color.green); break;
            case "BLUE":  main.setBackground(Color.blue);  break;
            case "YELLOW":  main.setBackground(Color.yellow); break;
            case "ORANGE":  main.setBackground(Color.orange); break;
            case "CYAN":  main.setBackground(Color.cyan); break;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorSelector().setVisible(true));
    }
}
