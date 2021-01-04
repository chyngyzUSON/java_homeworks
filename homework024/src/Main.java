import bread.Bakeable;
import bread.Bread;
import circle.Circle;
import circle.Drawing;

public class Main {

    public static void main(String[] args) {
	    Bread bread = new Bread();      //  через класс
	    bread.bake();

	    Bakeable bread1 = new Bread();  //  через интерфейс
	    bread1.bake();


        Circle circle = new Circle();   //  через класс
        circle.draw();

        Drawing drawing = new Circle(); //  через интерфейс
        drawing.draw();
    }
}
