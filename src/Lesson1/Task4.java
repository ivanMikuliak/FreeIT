package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }
    }
}
