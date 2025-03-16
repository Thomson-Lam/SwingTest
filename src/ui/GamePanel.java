package ui;
import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {
    public GamePanel(JPanel mainPanel, CardLayout cardLayout) {
        setLayout(new BorderLayout());
        JLabel gameLabel = new JLabel("Game Screen", SwingConstants.CENTER);
        JButton backButton = new JButton("Back to Menu");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "MainMenu"));
        
        add(gameLabel, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
    }
}