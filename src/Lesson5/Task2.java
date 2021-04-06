package Lesson5;

public class Task2 {
    //    Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//    позиции 0
    public static void main(String[] args) {
        String str = new String("LKJHGbbBFDSAQWERTYUGFLLLLLLLLLLLLLLLLLLLL");
        str = str.replaceAll(Character.toString(str.charAt(0)), Character.toString(str.charAt(3)));
        System.out.println(str);
    }
}
