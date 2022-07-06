package home.work.entity;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen {
    private int i;
    private JFrame frame;
    private Clow clow;
    private String victoryMessage;
    private JPanel panel;
    private JPanel buttonPanel;
    private JLabel label;
    private JButton button;

    public Screen() {
        this.i = 0;
        this.frame = new JFrame();
        this.clow = new Clow();
        this.victoryMessage = "";
        this.panel = new JPanel();
        this.buttonPanel = new JPanel();
    }


    public void onSilverScreen(String message) {
        frame.dispose();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(0, 3));

        panel.setLayout(new GridLayout(1, 0));
        buttonPanel.setLayout(new GridLayout(1, 0));

        this.label = new JLabel(message);
        button = new JButton("START");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i != Integer.valueOf(message)) {
                    System.out.println((i + 1) + " try :");
                    clow.tryToGetToy();
                } else {
                    System.out.println("THE END");
                    frame.dispose();
                    System.exit(0);
                }
                i++;
            }
        });
        buttonPanel.add(button);
        panel.add(label);
        frame.add(buttonPanel, 0);
        frame.add(panel, 1);
        frame.pack();
        frame.setVisible(true);
    }
}
