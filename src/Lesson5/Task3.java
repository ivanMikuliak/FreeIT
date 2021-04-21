package Lesson5;

import java.io.*;

public class Task3 {
    //    В исходном файле находятся слова, каждое слово на новой стороке. После
//    запуска программы должен создать файл, который будет содержать в себе
//    только полиндромы
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\i3332\\Desktop\\forJava.txt"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\i3332\\Desktop\\forJavaOut.txt"));
        String str;
        while (br.ready()) {
            str = br.readLine();
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                wr.write(str);
                wr.newLine();
                System.out.println(str); // check
            }
        }
        br.close();
        wr.close();
    }
}
