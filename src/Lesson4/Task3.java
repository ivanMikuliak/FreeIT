package Lesson4;

import java.util.Scanner;

public class Task3 {
    //3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    //массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    //это количество на экран на отдельной строке.
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //we're counting and bringing out number of even numbers
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        //extra task: Найти средне арифметическое элементов массива, превосходящих некоторое число С.
        int sum = 0;
        int secondCount = 0;
        System.out.println("Hello Svetlana and Maxim, please enter number : ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                sum += array[i];
                secondCount++;
            }
        }
        System.out.println();
        System.out.println(sum / secondCount);
    }
}
