package Lesson9;

import java.util.*;

public class Task2 {
    //    Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//    числа.
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int numbersQuantity;
        do {
            System.out.println("enter any positive number");
            while (!sc.hasNextInt()) {
                System.out.println("it's not a number!");
                sc.next();
            }
            numbersQuantity = sc.nextInt();

        } while (numbersQuantity <= 0);
        for (int i = 0; i < numbersQuantity; i++) {
            arrayList.add((int) (Math.random() * 20));
        }
        System.out.println(arrayList.toString());
        hashSet.addAll(arrayList);
        System.out.println("------------------------");
        System.out.println(hashSet.toString());
    }
}
