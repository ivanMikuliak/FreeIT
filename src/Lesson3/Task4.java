package Lesson3;

import java.util.Scanner;

public class Task4 {
    //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите первый множитель: ");
        int a = sc.nextInt();
        System.out.println("введите второй множитель: ");
        int b = sc.nextInt();
        int c =0;
        for (int i= 0;i<a;i++){
            c+=b;
        }
        System.out.println("Произведение чисел "+a+" "+b+" равняется "+c+".");
    }
}
