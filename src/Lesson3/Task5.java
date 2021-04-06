package Lesson3;

public class Task5 {
    //Напишите программу печати таблицы перевода расстояний
    // из дюймов в сантиметры для значений длин от 1 до 20 дюймов.
    // 1 дюйм = 2,54 см
    public static void main(String[] args) {
        double sm = 0;
        String one = "дюйм";
        String two = "дюйма";
        String three = "дюймов";
        for (int i = 1; i <= 20; i++) {
            sm = i * 2.54;
            if (i < 2) {
                System.out.println(i + " " + one + " это " + sm + " см");
            } else if (i < 5) {
                System.out.println(i + " " + two + " это " + sm + " см");
            } else {
                System.out.println(i + " " + three + " это " + sm + " см");
            }
        }
    }
}
