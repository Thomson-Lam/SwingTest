package ui;
import java.awt.*;
import javax.swing.*;

public class MainMenu extends JPanel {
    public MainMenu(JPanel mainPanel, CardLayout cardLayout) {
        setLayout(new BorderLayout());
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> cardLayout.show(mainPanel, "GamePanel"));
        add(startButton, BorderLayout.CENTER);
    }
}