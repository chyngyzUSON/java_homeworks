package com.company;

public class DivThread extends Thread {
    @Override
    public void run() {
        Main.number /= 2;
    }
}
