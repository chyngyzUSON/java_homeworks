package com.company.taskB;

import java.util.stream.IntStream;

public class ListRunner {
    public static void main(String[] args) {
        List<Number> list = new List<>(10);
        list.add(12);
        list.add(3);
        list.add(32.5);
        list.add(45);
        list.add(34.2);
        list.add(2.1);
        list.add(2.9);
        list.add(54);
        list.add(76.4);

        


        double sum = 0;
        double average = 0;
        for (int i = 0; i < list.getSize(); i++) {
            sum = sum + list.getSize();
        }
        System.out.println(sum);

        average = sum / list.getSize();
        System.out.println(average);


        //Number element = list.get(1);
        //System.out.println(element);
    }
}
