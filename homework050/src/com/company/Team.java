package com.company;

import java.util.Random;

public class Team implements Runnable{
    private Integer yellowCards;
    private Integer ballCount;
    private Integer offsideCount;

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            try {
                int yellowCardRandom = random.nextInt(5);
                if (yellowCardRandom == 1) yellowCards++;
                Thread.sleep(500);
                System.out.println("Количество желтых карточек");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 100; i++) {
            try {
                int ballCountRandom = random.nextInt(4);
                if (ballCountRandom == 1) ballCount++;
                Thread.sleep(500);
                System.out.println("Количество голов");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 100; i++) {
            try {
                int offsideCountRandom = random.nextInt(2);
                if (offsideCountRandom == 1) offsideCount++;
                Thread.sleep(500);
                System.out.println("Количество офсайдов");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }



}
