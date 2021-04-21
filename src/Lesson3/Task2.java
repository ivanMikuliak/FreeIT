package Lesson3;

public class Task2 {
    //Одноклеточная амеба каждые 3 часа делится на 2 клетки.
    // Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
    public static void main(String[] args) {
        int amebaCount =1;
        for(int i = 0; i<8;i++){
            amebaCount *=2;
            System.out.println(amebaCount);
        }
    }
}
