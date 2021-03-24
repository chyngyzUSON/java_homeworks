package com.company;

public class PlusThread extends Thread {
    @Override
    public void run() {
        Main.number += 2;
    }
}
