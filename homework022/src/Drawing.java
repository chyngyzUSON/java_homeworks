import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {
    public static final int FRAME_SIZE = 615;

    @Override
    public void paint(Graphics graphics) {
        //parabola
        Graphics2D g2 = (Graphics2D)graphics;
        g2.setColor(Color.RED);
        int h = 50;
        for (int i = -29; i < 30; i++) {
            int x = i * 5;
            int y = (x * x - h * h) / (2 * h);  //(x * x - h * h) / (2 * h)
            int answerX = 300 + x;
            int answerY = 300 - h - y;

            fillCircle(g2, answerX, answerY, 3);
        }

        //kub parabola
        Graphics2D g1 = (Graphics2D)graphics;
        g1.setColor(Color.BLACK);
        int h1 = 100;

        for (int i = -29; i < 30; i++) {
            int x = i * 10;
            int y = (x * x - h1 * h) / (2 * h1);
            int answerX = 300 + x;
            int answerY = 500 - h1 - y;

            fillCircle(g1, answerX, answerY, 4);
        }
    }

    private void fillCircle(Graphics2D g2, int centerX, int centerY, int radius) {
        g2.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }

    public static void main(String[] args) {
        Drawing canvas = new Drawing();
        JFrame jFrame = new JFrame("Параболы");
        jFrame.setSize(FRAME_SIZE, FRAME_SIZE);
        jFrame.setBackground(Color.GRAY);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(canvas);
        jFrame.setVisible(true);
    }
}
