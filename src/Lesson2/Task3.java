package Lesson2;

import java.util.Scanner;

public class Task3 {
    //Дано целое число. Если оно является положительным, то прибавить к нему 1.
    // Если отрицательным, то вычесть из него 2.
    // Если нулевым, то заменить его на 10.
    // Вывести полученное число
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            i = 10;
        } else if (i > 0) {
            i += 1;
        } else if (i < 0) {
            i -= 2;
        } else {
            System.out.println("you input incorrect number");
        }
        System.out.println(i);
    }
}