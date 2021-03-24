package com.company;

public class MinusThread implements Runnable{
    @Override
    public void run() {
        Main.number -= 2;
    }
}
