package home.work.entity;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    private JLabel label;
    private JFrame frame;

    public Screen() throws HeadlessException {
        this.frame = new JFrame("Экран");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setPreferredSize(new Dimension(250,80));
        this.frame.pack();
        this.frame.setVisible(true);
    }

    public void render(int numberOfTries){
        this.frame.dispose();
        this.frame = new JFrame("Экран");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.label = new JLabel(String.valueOf(numberOfTries));
        this.frame.getContentPane().add(label);
        this.frame.setPreferredSize(new Dimension(250,80));
        this.frame.pack();
        this.frame.setVisible(true);
    }
}
