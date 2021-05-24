package com.company;

import com.company.impl.StandardFillStrategy;

public class Auto {
    // используем интерфейс в качестве поля
    FillStrategy fillStrategy;

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
    System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void setFillStrategy(FillStrategy fillStrategy){
        this.fillStrategy = fillStrategy;
    }

    public Auto(FillStrategy fillStrategy){
        this.fillStrategy = fillStrategy;
    }
}

