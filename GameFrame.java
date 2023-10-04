import java.awt.*;
import javax.swing.*;  //responsible for the actual graphics of the game

/**
 * This is the frame around the game - the x button, minimize, etc...
 */
public class GameFrame extends JFrame{
    
    GamePanel panel = new GamePanel(); //canvas on which we are painting

    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
