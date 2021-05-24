package com.company.childauto;

import com.company.Auto;
import com.company.impl.ElectraFillStrategy;

public class ElectricCar extends Auto {
    public ElectricCar() {
        super(new ElectraFillStrategy());
    }
}
