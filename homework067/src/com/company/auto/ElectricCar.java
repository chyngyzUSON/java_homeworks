package com.company.auto;

import com.company.impl.ElectraFillStrategy;

public class ElectricCar extends Auto {
    public ElectricCar() {
        super(new ElectraFillStrategy());
    }
}
