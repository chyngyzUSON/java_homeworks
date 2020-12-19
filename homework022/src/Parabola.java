import java.awt.*;

public class Parabola {
    private int radius;
    private Color color;
    private int x;
    private int y;
    private static Color[] colors = {Color.RED, Color.BLUE};

    public Parabola(){}

    public Parabola(int radius, Color color, int x, int y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public static Color[] getColors() {
        return colors;
    }
    public static void setColors(Color[] colors) {
        Parabola.colors = colors;
    }


}
