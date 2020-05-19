import javax.swing.*;

public class SnakeApp  extends JFrame {
    public SnakeApp(){
        setTitle("SnakeGame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        SnakeApp  snakeApp = new SnakeApp();
    }
}
