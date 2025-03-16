// Main.java (Entry point of the application)
import javax.swing.*;
import java.awt.*;
import ui.MainMenu;
import ui.GamePanel;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Game Menu");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            
            CardLayout cardLayout = new CardLayout();
            JPanel mainPanel = new JPanel(cardLayout);
            
            MainMenu mainMenu = new MainMenu(mainPanel, cardLayout);
            GamePanel gamePanel = new GamePanel(mainPanel, cardLayout);
            
            mainPanel.add(mainMenu, "MainMenu");
            mainPanel.add(gamePanel, "GamePanel");
            
            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}