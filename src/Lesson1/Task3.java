package Lesson1;

/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.*/

public class Task3 {
    public static void main(String[] args) {
        int initialData = 4500;
        int sec = initialData % 60;
        int m = (initialData - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 60;
        int d = (h - hours) / 24;
        int days = d % 24;
        int w = (d - days) / 7;
        int week = w % 7;
        System.out.println(m + " минут " + sec + " секунд");
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(days + " дней " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(week + " недель " + days + " дней " + h + " часов " + min + " минут " + sec + " секунд");
    }
}