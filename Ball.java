import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;  //responsible for the actual graphics of the game

public class Ball extends Rectangle{
    
Random random;
int xVelocity;
int yVelocity;

    /**
     * Constructor for a ball
     */
    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0) {
            randomXDirection--;
        }
        setXDirection(randomXDirection);
        
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0) {
            randomYDirection--;
        }
        setYDirection(randomYDirection);

    }

    /**
     * So the ball can move horizontally across screen
     * @param randomXDirection - random because the ball needs to go random after being hit
     */
    public void setXDirection(int randomXDirection) {

    }

    /**
     * so the ball can move vertically across the screen
     * @param randomYDirection - random because the ball needs to go random after being hit
     */
    public void setYDirection(int randomYDirection) {
        
    }

    /**
     * So we can actually draw a ball on the screen
     * @param g - needed or javax.util
     */
    public void draw(Graphics g){

    }
}
