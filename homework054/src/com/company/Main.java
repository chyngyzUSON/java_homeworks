package com.company;

import org.w3c.dom.ls.LSOutput;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// task A
        System.out.println("Task A");
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(1, "Almaz");
        passportsAndNames.put(2, "Aibek");
        passportsAndNames.put(3, "Aman");
        passportsAndNames.put(4, "Tilek");
        passportsAndNames.put(5, "Aijan");
        passportsAndNames.put(6, "Aiperi");
        passportsAndNames.put(7, "Gulnur");
        passportsAndNames.put(8, "Asel");
        passportsAndNames.put(9, "Zalkar");
        passportsAndNames.put(10, "Cholpon");
        System.out.println(passportsAndNames);

        passportsAndNames.keySet()
                .stream()
                .filter(x -> x > 5)
                .filter(x -> x % 3 == 0)
                .forEach(x -> System.out.format("%s, ", x));
        System.out.println();

        passportsAndNames.entrySet()
                .stream()
                .filter(x -> x.getValue().length() > 5)
                .map(x -> x.getValue() + " == " +x.getKey() * 5)
                .forEach(x -> System.out.format("%s, ", x));

    // task B
        System.out.println();
        System.out.println("Task B");
        System.out.print("Рандомный массив из 20 чисел: ");
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ",  ");
        }
        System.out.println();
        System.out.print("Все четные числа из массива:  ");
        Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                //.map(x -> )
                .forEach(x -> System.out.print(x + ",  "));

        System.out.println();
        System.out.print("Все нечетные числа которые добавлены 10: ");
        //System.out.println("--------------");
        Arrays.stream(array)
                .filter(x -> x % 2 != 0)
                .map(x -> x + 10)
                .forEach(x -> System.out.print(x + ", "));
                //.collect(Collectors.toList())
    }
}
