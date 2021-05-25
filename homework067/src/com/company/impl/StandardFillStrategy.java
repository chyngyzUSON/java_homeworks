package com.company.impl;

import com.company.FillStrategy;

public class StandardFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.print(" просто заправляем бензином!");
    }
}
