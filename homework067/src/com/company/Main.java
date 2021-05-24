package com.company;

import com.company.childauto.ElectricCar;
import com.company.childauto.StandardCar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto tesla = new ElectricCar();
        Auto lada = new StandardCar();

        tesla.fill();
        lada.fill();
    }
}
