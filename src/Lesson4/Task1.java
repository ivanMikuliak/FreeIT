package Lesson4;

public class Task1 {
    //Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
    //массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
    //затем в столбик (отделяя один элемент от другого началом новой строки). Перед
    //созданием массива подумайте, какого он будет размера.
//    *Найти произведение элементов, кратных 3.
    public static void main(String[] args) {
        int[] array = new int[10];
        int number = 0;
        //fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = number + 2;
            number += 2;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.println(i);
            System.out.println();
        }
        //extra task
        for (int i = 0; i < array.length; i++){
            if(array[i]%3!=0){
                array[i]=1;
            }
        }
        int multiplication =1;
        for (int i = 0;i< array.length;i++){
            multiplication*=array[i];
        }
        System.out.println("multiplication = "+multiplication);
    }
}
