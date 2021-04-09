package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    //В переменную записываете количество программистов.
    // В зависимости от количества программистов необходимо вывести правильно окончание.
    // Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dev = Integer.parseInt(reader.readLine());
        if (dev == 1) {
            System.out.println(dev + " программист");
        }else if (dev <= 4) {
            System.out.println(dev + " программиста");
        } else {
            System.out.println(dev + " программистов");
        }
    }
}
