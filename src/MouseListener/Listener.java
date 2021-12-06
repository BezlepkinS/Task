package MouseListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class Listener extends JFrame {

    private final JLabel text0 = new JLabel("NORTH");
    private final JLabel text1 = new JLabel("CENTER");
    private final JLabel text2 = new JLabel("SOUTH");
    private final JLabel text3 = new JLabel("WEST");
    private final JLabel text4 = new JLabel("EAST");

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
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.BLACK);
        panel4.setBackground(Color.DARK_GRAY);
        panel5.setBackground(Color.DARK_GRAY);

        text0.setFont(new Font("Dialog", Font.ITALIC, 40));
        text0.setForeground(Color.BLUE);
        text1.setFont(new Font("Dialog", Font.ITALIC, 40));
        text1.setForeground(Color.BLUE);
        text2.setFont(new Font("Dialog", Font.ITALIC, 40));
        text2.setForeground(Color.BLUE);
        text3.setFont(new Font("Dialog", Font.ITALIC, 40));
        text3.setForeground(Color.BLUE);
        text4.setFont(new Font("Dialog", Font.ITALIC, 40));
        text4.setForeground(Color.BLUE);

        panel1.add(text0);
        panel2.add(text1);
        panel3.add(text2);
        panel4.add(text3);
        panel5.add(text4);

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
