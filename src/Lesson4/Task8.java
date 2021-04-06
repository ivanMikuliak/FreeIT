package Lesson4;

import java.util.Arrays;

public class Task8 {
    //    8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//    массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//    массива должен равняться отношению элемента из первого массива с i-ым
//    индексом к элементу из второго массива с i-ым индексом. Вывести все три
//    массива на экран (каждый на отдельной строке), затем вывести количество
//    целых элементов в третьем массиве.
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
            secondArray[i] = (int) (Math.random() * 10);
            if (secondArray[i] != 0) {
                thirdArray[i] = (double) firstArray[i] / (double) secondArray[i];
                if (thirdArray[i] % 1 == 0 && thirdArray[i] != 0) {
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(count);
        //extra task: 8) Найти второй по величине (т.е. следующий по величине за максимальным)
        //элемент в массиве.
        int highestNumber = 0;
        int preHighestNumber = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > highestNumber) {
                preHighestNumber = highestNumber;
                highestNumber = firstArray[i];
            } else if (firstArray[i] > preHighestNumber) {
                preHighestNumber = firstArray[i];
            }
        }
        System.out.println(preHighestNumber);
    }
}
