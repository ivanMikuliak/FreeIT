package Lesson5;

public class Task5 {
    //    Имеется строка с текстом. Вывести текст, составленный из последних букв
//    всех слов.
    public static void main(String[] args) {
        String text = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        String[] words = text.replaceAll("[,!@#$%^&*()\\.]", "").split(" ");
        for (String word : words) {
            System.out.print(word.substring(word.length() - 1, word.length()));
        }
    }
}
