import java.awt.*;

public class Score extends Rectangle{
    
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    /**
     * Constructor for the score
     * @param GAME_WIDTH - width of the game
     * @param Game_HEIGHT - height of the game
     */
    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    /**
     * So we can draw the score on the screen
     * @param g - needed so we can draw from javax.util
     */
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString(String.valueOf(player1/10) + String.valueOf(player1%10), (GAME_WIDTH/2) - 85, 50);
        g.drawString(String.valueOf(player2/10) + String.valueOf(player2%10), (GAME_WIDTH/2) + 20, 50);
    }
}
