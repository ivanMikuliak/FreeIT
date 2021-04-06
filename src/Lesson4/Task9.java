package Lesson4;

import java.util.Scanner;

public class Task9 {
    //    9)Пользователь должен указать с клавиатуры положительное число, а
//    программа должна создать массив указанного размера из случайных целых
//    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//    определить и сообщить пользователю о том, сумма какой половины массива
//    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//    пользователь введёт неподходящее число, то выдать соответствующее
//    сообщение
    public static void main(String[] args) {
        System.out.println("please, enter correct number:");
        Scanner sc = new Scanner(System.in);
        int positiveNumber;
        do {
            positiveNumber = sc.nextInt();
            if (positiveNumber < 0 || positiveNumber % 2 != 0) {
                System.out.println("you entered incorrect number: " + positiveNumber);
            }
        } while (positiveNumber < 0 || positiveNumber % 2 != 0);
        int[] array = new int[positiveNumber];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
            System.out.print(array[i] + " ");
        }
        int firstSumPartOfArray = 0;
        int secondSumPartOfArray = 0;
        for (int i = 0; i < (array.length) / 2; i++) {
            firstSumPartOfArray += array[i];
            secondSumPartOfArray += array[array.length - 1 - i];
        }
        if (firstSumPartOfArray == secondSumPartOfArray) {
            System.out.println("sum fo first part = sum of second part of array");
        } else if (firstSumPartOfArray > secondSumPartOfArray) {
            System.out.println("sum of first part fo array more then second");
        } else {
            System.out.println("sum of second part fo array more then first");
        }
        //extra task 9: 9) Найти наименьший элемент среди элементов с четными индексами массива
        int minimum = 15;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                if (array[i] < minimum) {
                    minimum = array[i];
                }
            }
        }
        System.out.println("minimum = " + minimum);
    }
}
