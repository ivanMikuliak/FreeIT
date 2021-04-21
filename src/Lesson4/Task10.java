package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


//    10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
        System.out.println("please, enter a number greater than 3:");
        Scanner sc = new Scanner(System.in);
        //     Если пользователь ввёл не подходящее число,то программа должна выдать соответствующее сообщение.
        boolean flag = true;
        int n = 0;
        while (flag) {
            n = sc.nextInt();
            if (n > 3) flag = false;
            else System.out.println("you dialed incorrect number! Try again");
        }
        //    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (n + 1));
            if (array[i] % 2 == 0 & array[i] != 0) count++;
        }
        System.out.println(Arrays.toString(array));
//    Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        if (count > 0) {
            int[] secondArray = new int[count];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 & array[i] != 0) {
                    secondArray[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(secondArray));
        }
        //extra task 10: 10) Найти максимальный элемент в массиве и поменять его местами с нулевым
        //элементом
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                // array[0]= maxValue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                array[i] = array[0];
                array[0] = maxValue;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}