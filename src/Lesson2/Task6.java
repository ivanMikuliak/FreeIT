package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    //Даны 2 числа. Вывести большее из них
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int max = 0;
        while (count != 2) {
            int number = Integer.parseInt(reader.readLine());
            if (number > max) max = number;
            count++;
        }
        System.out.println(max);
    }
}
