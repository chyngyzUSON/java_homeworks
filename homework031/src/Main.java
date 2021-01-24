import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] a = new int [5];
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Рандомный массив");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(2);
            linkedList.add(random.nextInt(2));
            arrayList.add(random.nextInt(2));
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        System.out.println();
        System.out.println("Рандомный Linked List: " + linkedList);
        System.out.println("Рандомный Array List: " + arrayList);

        System.out.println();
        System.out.println("====================Результаты сортировки=====================");
        System.out.println();

        System.out.println("Cортированный массив");

        int[] newArray = sort(a);
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

        linkedList = sort(linkedList);
        System.out.println("Сортированный Linked List: " + linkedList);

        arrayList = sort(arrayList);
        System.out.println("Сортированный Array List: " + arrayList);
    }
    // перегруженный метод для простого массива
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                int nextIndex = j + 1;
                if (a[j] > a[nextIndex]) {
                    int t = a[j];
                    a[j] = a[nextIndex];
                    a[nextIndex] = t;
                }
            }
        }
        return a;
    }

    // перегруженный метод для Arraylist
    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        Collections.sort(list);
        for (Integer num : list) {
            System.out.println(num);
        }
        return res;
    }

    // перегруженный метод для LinkedList
    public static LinkedList<Integer> sort(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer number : list) {
            if (number == 0) {
                result.addFirst(number);
            } else if (number == 1) {
                result.addLast(number);
            }
        }
        return result;
    }
}
