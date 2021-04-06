package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    //    7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//    какой элемент является в этом массиве максимальным и сообщите индекс его
//    последнего вхождения в массив.
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
            if (max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max number = " + max + ", index = " + index);
        //extra task: 7) Подсчитать, сколько раз встречается элемент с заданным значением.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from zero to fifteen:");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) count++;
        }
        System.out.println("number: " + number + " meets: " + count + " times");
    }
}
