package com.company;

import com.company.auto.ElectricCar;
import com.company.auto.StandardCar;
import com.company.auto.Auto;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto tesla = new ElectricCar();
        Auto lada = new StandardCar();

        System.out.println("Tesla Model S");
        tesla.gas();
        tesla.stop();
        System.out.print("Электромобил Tesla ");
        tesla.fill();

        System.out.println();

        System.out.println("Lada Sedan");
        lada.gas();
        lada.stop();
        System.out.print("обычную машину ");
        lada.fill();
    }
}
