package MouseListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class Listener extends JFrame {

    private final JLabel button0 = new JLabel("NORTH");
    private final JLabel button1 = new JLabel("CENTER");
    private final JLabel button2 = new JLabel("SOUTH");
    private final JLabel button3 = new JLabel("WEST");
    private final JLabel button4 = new JLabel("EAST");

    private final JPanel panel0 = new JPanel();
    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();
    private final JPanel panel3 = new JPanel();
    private final JPanel panel4 = new JPanel();
    private final JPanel panel5 = new JPanel();

    public Listener() {
        super("Listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 500);
        Panel();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void Panel() {
        BorderLayout layout = new BorderLayout();
        Container container = this.getContentPane();
        container.setLayout(layout);
        container.add(BorderLayout.NORTH, panel1);
        container.add(BorderLayout.CENTER, panel2);
        container.add(BorderLayout.SOUTH, panel3);
        container.add(BorderLayout.WEST, panel4);
        container.add(BorderLayout.EAST, panel5);

        panel1.setBackground(Color.GRAY);
        ;
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.BLACK);
        panel4.setBackground(Color.DARK_GRAY);
        panel5.setBackground(Color.DARK_GRAY);

        button0.setFont(new Font("Dialog", Font.ITALIC, 40));
        button0.setForeground(Color.BLUE);
        button1.setFont(new Font("Dialog", Font.ITALIC, 40));
        button1.setForeground(Color.BLUE);
        button2.setFont(new Font("Dialog", Font.ITALIC, 40));
        button2.setForeground(Color.BLUE);
        button3.setFont(new Font("Dialog", Font.ITALIC, 40));
        button3.setForeground(Color.BLUE);
        button4.setFont(new Font("Dialog", Font.ITALIC, 40));
        button4.setForeground(Color.BLUE);

        panel1.add(button0);
        panel2.add(button1);
        panel3.add(button2);
        panel4.add(button3);
        panel5.add(button4);

        panel1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                String message = "";
                message += "Welcome to Saint-Petersburg!\n";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        });
        panel2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                String message = "";
                message += "Welcome to Rome!\n";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        });
        panel3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                String message = "";
                message += "Welcome to Nigeria!\n";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        });
        panel4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                String message = "";
                message += "Welcome to New York!\n";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        });
        panel5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                String message = "";
                message += "Welcome to Pekin!\n";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}
