package Lesson4;

public class Task2 {
    //2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
    //строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
    //порядке (99 97 95 93 ... 7 5 3 1).
    //Найти среднее арифметическое элементов с нечетными номерами.
    public static void main(String[] args) {
        int[] array = new int[100];
        int number = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=array.length-1;i>0;i--){
            System.out.print(array[i]+" ");
        }
        //extra task
        int sum=0;
        for (int i = 0; i< array.length; i++){
            sum+=array[i];
        }
        System.out.println();
        System.out.println(sum/ array.length);
    }
}
