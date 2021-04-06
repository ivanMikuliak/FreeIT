package Lesson3;

public class Task1 {
    //Начав тренировки, спортсмен в первый день пробежал 10 км.
    // Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    // Какой суммарный путь пробежит спортсмен за 7 дней?
    public static void main(String[] args) {
        double way = 10;
        double sum = 10;
        for(int i = 0;i<6; i++){
            way *=1.1;
            sum +=way;
        }
        System.out.println(sum);
    }
}
