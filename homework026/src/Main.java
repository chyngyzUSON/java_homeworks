import flyables.Duck;
import flyables.Flyable;
import flyables.Parrot;
import flyables.Plane;
import running.Cat;
import running.Person;
import running.Runnable;
import swimmables.Shark;
import swimmables.Ship;
import swimmables.Swimmable;
import swimmables.Whale;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// летающие
        Flyable[] flyables = new Flyable[3];
        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }

    // бегающие
        Runnable[] runnables = new Runnable[2];
        for (int i = 0; i < runnables.length; i++) {
            runnables[i].run();
        }

    // плавающие
        Swimmable[] swimmables = new Swimmable[3];
        for (int i = 0; i < swimmables.length; i++) {
            swimmables[i].swim();
        }

    }
}
