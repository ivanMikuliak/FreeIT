package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    //Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positive = 0;

        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number > 0) positive++;
        }
        System.out.println("quantity of positive numbers: " + positive);
    }
}
