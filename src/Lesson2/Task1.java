package Lesson2;

import java.util.Scanner;

public class Task1 {
    //В переменную записываем число.
    // Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    // Например, "это однозначное положительное число".
    // Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.
    public static void main(String[] args) {
        // write your code here
        System.out.println("Please enter number!");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.println("you entered zero");
        }
        if (i != 0) {
            if (i > 0) {
                System.out.print("its positive");
            } else {
                System.out.print("its negative");
            }
            i = Math.abs(i);
            if (i >= 100) {
                System.out.println(" three digit number");
            } else if (i >= 10) {
                System.out.println(" two digit number");
            } else {
                System.out.println(" one digit number");
            }
        }
    }
}
