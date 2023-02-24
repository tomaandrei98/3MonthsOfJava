package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LogInPage implements ActionListener {

    private JFrame frame = new JFrame();
    private JButton loginButton = new JButton("Login");
    private JButton resetButton = new JButton("Reset");
    private JButton signUpButton = new JButton("Sign Up");
    private JButton createButton = new JButton("Create");
    private JTextField userIDField = new JTextField();
    private JPasswordField userPasswordField = new JPasswordField();
    private JLabel userIDLabel = new JLabel("userID:");
    private JLabel userPasswordLabel = new JLabel("password:");
    private JLabel messageLabel = new JLabel();

    private Map<String, String> loginInfo;

    public LogInPage() {
        loginInfo = new HashMap<>();

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(75, 300, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);


        loginButton.setBounds(75, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        signUpButton.setBounds(150, 250, 100, 25);
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);

        createButton.setBounds(150, 250, 100, 25);
        createButton.setFocusable(false);
        createButton.setVisible(false);
        createButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(signUpButton);
        frame.add(createButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
            userIDField.requestFocus();
        }

        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String userPassword = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(userPassword)) {
                    messageLabel.setForeground(Color.DARK_GRAY);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);


                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong password");
                }
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username not found");
            }

        }

        if (e.getSource() == signUpButton) {
            resetButton.setVisible(false);
            loginButton.setVisible(false);
            signUpButton.setVisible(false);
            createButton.setVisible(true);

            messageLabel.setForeground(Color.DARK_GRAY);
            messageLabel.setText("Enter credentials...");
        }

        if (e.getSource() == createButton) {
            createUser();
        }
    }

    private void createUser() {
        messageLabel.setForeground(Color.DARK_GRAY);
        messageLabel.setText("User created!");

        loginInfo.put(
                userIDField.getText(),
                String.valueOf(userPasswordField.getPassword())
        );

        userIDField.setText("");
        userPasswordField.setText("");
        userIDField.requestFocus();

        resetButton.setVisible(true);
        loginButton.setVisible(true);
        signUpButton.setVisible(true);
        createButton.setVisible(false);
    }
}
