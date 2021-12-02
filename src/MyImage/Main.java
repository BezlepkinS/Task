package MyImage;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyImage app = new MyImage(args[0]);
                app.setVisible(true);
            }
        });
    }
}