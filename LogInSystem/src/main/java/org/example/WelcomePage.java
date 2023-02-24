package org.example;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame;
    JLabel welcomeLabel;

    public WelcomePage(String userID) {
        frame = new JFrame();

        welcomeLabel = new JLabel(String.format("Hello, %s!", userID));
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
