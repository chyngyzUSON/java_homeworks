package com.company;

public class MultThread implements Runnable {
    @Override
    public void run() {
        Main.number *= 2;
    }
}
