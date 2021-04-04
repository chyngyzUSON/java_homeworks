package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
                return result;
        };
        System.out.println("Факториал из 5 = " + factorial.func(5));

        GenericInterface<Integer> sqrt = (n) -> {
            int a = n;
            int b = n;
            int result;
            result = (int) Math.pow(a, b);
            return result;
        };
        System.out.println("квадратный корень из n = " +sqrt.func(3));
    }
}

//  Task B
/*
1. Что такое анонимный класс?
расширяет любой расширяемый класс или реализует абстрактные методы интерфейса

2. Что такое лямбда?
основная цель - повысить читабельность и уменшить количество кода.
И реализует метод функционального интерфейса

3. В чем разница между лямбдой и анонимным классом?
лямбда - реализует метод, а анонимный класс расширает реализацию метода интерфейсов

4. Что такое функциональный интерфейс?
если интерфейс имеет только один абстрактный метод, то такой интерфейс называется функциональным.
И для компилятора надо указать аннотацию @FunctionalInterface.

5. Можем ли мы создать анонимный класс на основе интерфейса с более чем одним методом? Почему?
думаю что да, для расширения лямбду выражении с помощью анонимного класса

6. Можем ли мы создать лямбду на основе интерфейса с более чем одним методом? Почему?
нет, потому что лямбда реазизует только один метод.
* */
