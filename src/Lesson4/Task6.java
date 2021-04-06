package Lesson4;

public class Task6 {
    //6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    //на экран в строку. Определить и вывести на экран сообщение о том, является ли
    //массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        boolean ascending = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                ascending = false;
            }
        }
        System.out.println("Array is ascending: " + ascending);
        //extra task: 6) Проверить, различны ли все элементы массива.
        boolean dif = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    dif = false;
                }
            }
        }
        System.out.println("Array is different: " + dif);
    }
}
