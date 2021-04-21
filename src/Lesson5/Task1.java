package Lesson5;

public class Task1 {
    //    Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//    последнего вхождения сивола(B).
    public static void main(String[] args) {
        String str = new String("LKJHGbbBFDSAQWERTYUGFDSAAZXCVBJHGFFGHJIOIUYTR");
        str = str.substring(str.indexOf("A"), str.lastIndexOf("B"));
        System.out.println(str);
    }
}
