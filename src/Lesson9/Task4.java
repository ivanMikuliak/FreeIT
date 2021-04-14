package Lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task4 {
    //    Имеется текст. Следует составить для него частотный словарь.
    public static void main(String[] args) throws IOException {
        Map<String, Integer> vocabulary = new HashMap<>();
        ArrayList<String> words = new ArrayList<>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\i3332\\Desktop\\forJava.txt"));
        while ((line = reader.readLine()) != null) {
            List<String> lines = Arrays.asList(line.split("\\W+"));
            words.addAll(lines);
        }
        for (String word : words) {
            if (!vocabulary.containsKey(word)) {
                vocabulary.put(word, 1);
            } else {
                vocabulary.put(word, vocabulary.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : vocabulary.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}
