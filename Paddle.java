import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle{
    

    int id; // id of player 1 or plaer 2
    int yVelocity;
    int speed = 10;
    
    /**
     * Constructor for a Paddle
     */
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT); // super sends the info to the super class - Rectangle so we can get some of the other values assigned for us
        this.id = id;
    }

    /**
     * If the user presses a key
     * @param e - holds the actual key that was pressed
     */
    public void keyPressed(KeyEvent e) {
        switch(id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }

    /**
     * If the user releases a pressed key
     * @param e - holds the actual key that was pressed
     */
    public void keyReleased(KeyEvent e) {
        switch(id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                    move();
                }
                break;
        }
    }

    /**
     * Paddles only move vertically, so no x needed
     * @param yDirection
     */
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    /**
     * So we can represent movement
     */
    public void move() {
        y = y + yVelocity;
    }

    /**
     * so we can draw a paddle on screen
     * @param g - used for javax.util
     */
    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.blue);
        }
        else {
            g.setColor(Color.red);
        }
        g.fillRect(x, y, width, height);
    }
}
