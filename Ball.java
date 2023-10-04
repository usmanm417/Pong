import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{
    
Random random;
int xVelocity;
int yVelocity;
int initialSpeed = 2;

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
        setXDirection(randomXDirection * initialSpeed);
        
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0) {
            randomYDirection--;
        }
        setYDirection(randomYDirection * initialSpeed);

    }

    /**
     * So the ball can move horizontally across screen
     * @param randomXDirection - random because the ball needs to go random after being hit
     */
    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    /**
     * So the ball can move vertically across the screen
     * @param randomYDirection - random because the ball needs to go random after being hit
     */
    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    /**
     * So we can move objects around the screen
     */
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    /**
     * So we can actually draw a ball on the screen
     * @param g - needed or javax.util
     */
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }
}
