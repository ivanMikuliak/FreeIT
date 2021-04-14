package Lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    //    Создать список оценок учеников с помощью ArrayList, заполнить случайными
//    оценками. Удалить неудовлетворительные оценки из списка.
    public static void main(String[] args) {
        List<Integer> markList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pupilQuantity;
        do {
            System.out.println("enter quantity of pupils");
            while (!sc.hasNextInt()) {
                System.out.println("it's not a number!");
                sc.next();
            }
            pupilQuantity = sc.nextInt();

        } while (pupilQuantity <= 0);
        for (int i = 0; i < pupilQuantity; i++) {
            markList.add((int) (Math.random() * 11));
        }
        System.out.println(markList.toString());
        Iterator<Integer> markIterator = markList.iterator();
        while (markIterator.hasNext()) {
            if (markIterator.next() < 3) {
                markIterator.remove();
            }
        }
        System.out.println("_____________________________");
        System.out.println(markList.toString());
    }
}
