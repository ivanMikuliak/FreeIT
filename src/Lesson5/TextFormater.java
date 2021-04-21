package Lesson5;

import java.io.*;

public class TextFormater {
    //    Текстовый файл содержит текст. После запуска программы в другой файл
//    должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//    предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//    слов в предложении, оно попадает в новый файл.
//    Пишем все в ООП стиле. Создаём класс TextFormater
//    в котором два статических метода:
//            1. Метод принимает строку и возвращает кол-во слов в строке.
//            2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//    есть возвращает true, если нет false
//    В main считываем файл.
//    Разбиваем текст на предложения. Используя методы класса TextFormater
//    определяем подходит ли нам предложение. Если подходит добавляем его в
//    новый файл
    public static int wordCounter(String str) {
        String[] words = str.split("\\s");
        return words.length;
    }

    public static boolean polindromHunter(String str) {
        String[] words = str.split("\\s");
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\i3332\\Desktop\\forJava2.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\i3332\\Desktop\\forJava3.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = reader.readLine();
            }
            String allText = sb.toString();
            String[] sentence = allText.split("\\.");
            for (String words : sentence) {
                if (polindromHunter(words)) {
                    writer.write(words);
                    System.out.println(words);
                }else if(wordCounter(words) > 2 && wordCounter(words) < 6){
                    System.out.println(words);
                    writer.write(words);
                    writer.newLine();
                }
            }
        } finally {
            reader.close();
            writer.close();
        }
    }
}
