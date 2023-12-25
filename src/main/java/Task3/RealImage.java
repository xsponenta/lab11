package Task3;

import javax.swing.*;

public class RealImage implements MyImage {
    private final JFrame frame;

    public RealImage(String filename) {
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame = new JFrame();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void display() {
        frame.setVisible(true);
    }
}