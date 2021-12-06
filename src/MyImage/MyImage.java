package MyImage;

import java.awt.*;
import javax.swing.*;

public class MyImage extends JFrame {
    private JLabel pictureLabel;
    private Container container;

    public MyImage(String Image) {
        super("UwU");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.setSize(1000, 563);
        setLocationRelativeTo(null);
        startWindow(Image);
    }
    private void startWindow(String Image) {
        container = new Container();
        container = getContentPane();
        container.setLayout(new FlowLayout());
        pictureLabel = new JLabel(new ImageIcon(Image));
        container.add(pictureLabel);
    }
}
