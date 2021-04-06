package Lesson4;

import java.util.Arrays;

public class Task4 {
    //Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
    //массив на экран в строку. Замените каждый элемент с нечётным индексом на
    //ноль. Снова выведете массив на экран на отдельной строке.
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        //extra task :  Найти наименьший нечетный элемент.
        int min = 20;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] != 0) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println(min);
    }
}
