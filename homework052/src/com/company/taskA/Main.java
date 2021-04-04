package com.company.taskA;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    //Task A
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("first");
    }
}

/*
1. Почему класс List<Object> не является родителем класса List<String>?
и List<Object>, и List<String> являются подтипами List<?>
2. Для чего нужны wildcards?
Wildcards помогает избежать некоторые ограничения дженериков. Например при несовместимости типов, мы можем использовать знак ?
* */
