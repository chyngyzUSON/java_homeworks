package com.company.childauto;

import com.company.Auto;
import com.company.impl.StandardFillStrategy;

public class StandardCar extends Auto {
    public StandardCar() {
        super(new StandardFillStrategy());
    }
}
