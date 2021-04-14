package Lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    //    Создать список оценок учеников с помощью ArryList, заполнить случайными
//    оценками. Найти самую высокую оценку с использованием итератора.
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
        int highestMark = 0;
        Iterator<Integer> markIterator = markList.iterator();
        while (markIterator.hasNext()) {
            int mark = markIterator.next();
            if (mark > highestMark) {
                highestMark = mark;
            }
        }
        System.out.println("_____________________________");
        System.out.println("Highest mark is: " + highestMark);
    }
}
