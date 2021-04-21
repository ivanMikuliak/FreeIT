package Lesson4;

import java.util.Arrays;

public class Task5 {
//5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,

    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 16);
            secondArray[i] = (int) (Math.random() * 16);
        }
        //выведите массивы на экран в двух отдельных строках.
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        // Посчитайте среднееарифметическое элементов каждого массива и сообщите, для какого из
        //массивов это значение оказалось больше (либо сообщите, что их средние
        //арифметические равны).
        double midArithmeticFirst = 0;
        double midArithmeticSecond = 0;
        for (int i = 0; i < firstArray.length; i++) {
            midArithmeticFirst += firstArray[i];
            midArithmeticSecond += secondArray[i];
        }
        midArithmeticFirst /= firstArray.length;
        midArithmeticSecond /= secondArray.length;
        System.out.println("среднее арифметическое для первого массива = "
                + midArithmeticFirst);
        System.out.println("среднее арифметическое для второго массива = "
                + midArithmeticSecond);
        if (midArithmeticFirst == midArithmeticSecond) {
            System.out.println("mid-arithmetics are equals");
        } else if (midArithmeticFirst > midArithmeticSecond) {
            System.out.println("mid-arithmetic first array more then second one");
        } else {
            System.out.println("mid-arithmetic second array more then first one");
        }
        //extra task: «Сожмите» массив, выбросив из него каждый второй элемент.
        // «Освободившиеся» места массива заполните нулями.
        for (int i = 0; i < firstArray.length; i++) {
            if (i%2!=0) firstArray[i] = 0;
        }
        for (int i = 0; i < secondArray.length; i++) {
            if (i%2!=0) secondArray[i] = 0;
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }
}
