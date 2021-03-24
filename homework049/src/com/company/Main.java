package com.company;

public class Main {
// task A
    public static int number = 2;

    public static void main(String[] args)  {
        System.out.println("Start: value = " + number);

        //сложение
        PlusThread plusThread = new PlusThread();
        plusThread.start();

        //умножение
        Thread multThread = new Thread(new MultThread());
        multThread.start();

        //деление
        DivThread divThread = new DivThread();
        divThread.start();

        //вычитание
        Thread minusThread = new Thread(new MinusThread());
        minusThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End: value = " + number);
    }
}

// task B
/*
1. Что для вас поток?
для меня параллельное выполнение нескольких задач одновременно,
но для процессора по очередное выполнение нескольких задач по частям(псевдопараллельность)

2. Как вы понимаете многопоточное программирование?
многопоточность решает 2 задачи:
    1) Одновременно выполнить несколько действий
    2) И ускорить вычисления

3. Для чего по-вашему нам нужны потоки?
Чтобы решить 2 проблемы указанные в пункте 2.

4. Представьте себе, что люди работают параллельно над одной задачей, какие проблемы могут всплыть из-за этого?
-несогласованность (race condition)
-ожидание друг друга (deadlock)
-

5. Что такое synchronized?
модификатор многопоточности заставляет работать по очередно, по праdилам "mutex"

*/
