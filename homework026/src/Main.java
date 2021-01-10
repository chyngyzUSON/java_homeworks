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
        System.out.println("______________________");
        Flyable[] flyables = new Flyable[3];
        for (int i = 0; i < flyables.length; i++) {
            if (i < 1) flyables[i] = new Duck();
            else if (i < 2) flyables[i] = new Parrot();
            else flyables[i] = new Plane();
        }
        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }
        System.out.println("______________________");

    // бегающие
        Runnable[] runnables = new Runnable[2];
        for (int i = 0; i < runnables.length; i++) {
            if (i < 1) runnables[i] = new Cat();
            else runnables[i] = new Person();
        }
        for (int i = 0; i < runnables.length; i++) {
            runnables[i].run();
        }
        System.out.println("______________________");

    // плавающие
        Swimmable[] swimmables = new Swimmable[3];
        for (int i = 0; i < swimmables.length; i++) {
            if (i < 1) swimmables[i] = new Shark();
            else if (i < 2) swimmables[i] = new Ship();
            else swimmables[i] = new Whale();
        }
        for (int i = 0; i < swimmables.length; i++) {
            swimmables[i].swim();
        }

    }
}
