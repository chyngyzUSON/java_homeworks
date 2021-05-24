package com.company.impl;

import com.company.FillStrategy;

public class ElectraFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Зарядка электричеством!");
    }
}
