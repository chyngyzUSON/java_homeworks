import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	//  Task A
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Ветер с моря дул");
//        list.add("Ветер с моря дул");
//        list.add("Нагонял беду");
//        list.add("Нагонял беду");
//        list.add("И сказал ты мне");
//        list.add("И сказал ты мне");
//        list.add("Больше не приду");
//        list.add("Больше не приду");
//        System.out.println(list);
//
//
//        ArrayList<String> secondList = new ArrayList<>();
//
//        if (list.get(0).length() >= 15 && list.get(1).length() >= 15)
//            secondList.add("Ветер с моря дул");
//        if (list.get(2).length() >= 15 && list.get(3).length() >= 15)
//            secondList.add("Нагонял беду");
//        if (list.get(4).length() >= 15 && list.get(5).length() >= 15)
//            secondList.add("И сказал ты мне");
//        if (list.get(6).length() >= 15 && list.get(7).length() >= 15)
//            secondList.add("Больше не приду");
//        secondList.remove("И сказал ты мне");
//
//        System.out.println(secondList);

    //  Task B

        ArrayList<Integer> randomList = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        Random random = new Random();
        int size = 50;
        for (int i = 1; i < size; i++) {
            randomList.add(random.nextInt(50));
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
            else
                oddNumbers.add(i);
        }
        System.out.println("Рандомный список: " + randomList);
        System.out.println("Четные числа" + evenNumbers);
        System.out.println("Нечетные числа" + oddNumbers);
    }
}
