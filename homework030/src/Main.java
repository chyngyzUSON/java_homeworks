import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// создание 1000000 кошек
//        ArrayList<Object> cats = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            cats.add(i);
//        }
//
//        ArrayList<Object> secondCats = new ArrayList<>();
//    // создание 100 кошек
//        for (int i = 0; i < 100; i++) {
//            secondCats.add(i);
//        }
//
//        System.out.println("-------Операции с ArrayList'ом--------");
//        long millisBefore = System.currentTimeMillis();
//        cats.addAll(500000, secondCats);
//        long millisAfter = System.currentTimeMillis();
//        long resultMiddleAdd = millisAfter - millisBefore;
//        System.out.println("Время добавлении в середину ArrayList: " + resultMiddleAdd);
//
//        long millisBefore1 = System.currentTimeMillis();
//        cats.addAll(0, secondCats);
//        cats.addAll(secondCats);
//        long millisAfter1 = System.currentTimeMillis();
//        long resultStartAdd = millisAfter1 - millisBefore1;
//        System.out.println("Время добавления в начало/конец ArrayList: " + resultStartAdd);
//
//        long milBefore1 = System.currentTimeMillis();
//        cats.get(500000);
//        cats.get(999999);
//        long milAfter1 = System.currentTimeMillis();
//        long resultGets = milAfter1 - milBefore1;
//        System.out.println("Время считывания из середины и конца: " + resultGets);
//
//        long milBefore2 = System.currentTimeMillis();
//        cats.remove(500000);
//        cats.remove(999999);
//        long milAfter2 = System.currentTimeMillis();
//        long resultRemove = milAfter2 - milBefore2;
//        System.out.println("Время удаления из середины/конца: " + resultRemove);
//
//    // создание 1000000 собак
//        LinkedList<Object> dogs = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++) {
//            dogs.add(i);
//        }
//
//    // создание 100 собак
//        LinkedList<Object> secondDogs = new LinkedList<>();
//        for (int i = 0; i < 100; i++) {
//            dogs.add(i);
//        }
//
//        System.out.println();
//        System.out.println("------Операции с LinkedList'ом--------");
//        long start = System.currentTimeMillis();
//        dogs.addAll(500000, secondDogs);
//        long end = System.currentTimeMillis();
//        long resultMidAdd = end - start;
//        System.out.println("Время добавления в середину LinkedList: " + resultMidAdd);
//
//        long start1 = System.currentTimeMillis();
//        dogs.addAll(0, secondDogs);
//        dogs.addAll(999999, secondDogs);
//        long end1 = System.currentTimeMillis();
//        long resStartAdd = end1 - start1;
//        System.out.println("Время добавления в начало/конец LinkedList: " + resStartAdd);
//
//        long start2 = System.currentTimeMillis();
//        dogs.get(500000);
//        dogs.get(999999);
//        long end2 = System.currentTimeMillis();
//        long resultGets1 = end2 - start2;
//        System.out.println("Время считывания из середины/конца: " + resultGets1);
//
//        long start3 = System.currentTimeMillis();
//        dogs.remove(500000);
//        dogs.remove(999999);
//        long end3 = System.currentTimeMillis();
//        long resultRemove1 = end3 - start3;
//        System.out.println("Время удаления из середины/конца: " + resultRemove1);
//
//        System.out.println();
//        System.out.println("---------Статистика-------");
//        int linkedList = 0;
//        int arrayList = 0;
//
//        if (resultRemove1 > resultRemove)
//            linkedList++; else arrayList++;
//
//        if (resultGets1 > resultGets)
//            linkedList++; else arrayList++;
//
//        if (resStartAdd > resultStartAdd)
//            linkedList++; else arrayList++;
//
//        if (resultMidAdd > resultMiddleAdd)
//            linkedList++; else arrayList++;
//
//        if (linkedList > arrayList)
//            System.out.println("Операции в LinkedList'e были быстрее");
//        else
//            System.out.println("Операции в ArrayList'e были быстрее");

    // Task B

        List<Animal> pets = new LinkedList<>();
        //создаем по 50 кошек и собак, с возрастом идущим на увеличение
        for (int i = 1; i <= 50; i++) {
            pets.add(new Cat("Cat", i));
            pets.add(new Dog("Dog", i));
        }
        System.out.println(pets);

        int catCount = 0, dogCount = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat){ // здесь ищем и увеличиваем количество кошек
                catCount++;
                if (catCount % 5 == 0){ //удаляем из списка каждую 5-кошку
                    pets.remove(i);
                    i--;
                }
            }
            else if (pets.get(i) instanceof Dog) { // а здесь ищем и увеличиваем количество собак
                dogCount++;
                if (dogCount % 3 == 0){ //вставляем после каждой 3-собаки одну мышку
                    pets.add(i, new Mouse("Mouse", i));
                    Animal tmp = pets.get(i);
                    pets.set(i, pets.get(i + 1));
                    pets.set(i + 1, tmp);
                }
            }
        }

        for (int i = 0; i < pets.size(); i++) {
            //Animal
        }
        System.out.println(pets);
    }
}
