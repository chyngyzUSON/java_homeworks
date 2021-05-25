package com.company.auto;

import com.company.impl.StandardFillStrategy;

public class StandardCar extends Auto {
    public StandardCar() {
        super(new StandardFillStrategy());
    }
}
