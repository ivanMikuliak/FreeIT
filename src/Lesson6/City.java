package Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class City {
    //    Создать класс City (город)
//    с внутренним классом, с помощью объектов которого можно хранить информацию
//    о проспектах, улицах, площадях
    public static Scanner sc = new Scanner(System.in);
    public Info info;
    private String name;

    public City() {
        System.out.println("Enter city name: ");
        name = sc.next();
        info = new Info();
    }

    class Info {
        private Map<String, Integer> avenue = new HashMap<>();
        private Map<String, Integer> streets = new HashMap<>();
        private ArrayList<String> squares = new ArrayList<>();

        public void addAvenue(String avenueName, Integer number) {
            avenue.put(avenueName, number);
        }

        public void deleteAvenue(String avenueName) {

            avenue.remove(avenueName);
        }

        public void printAvenue() {
            for (Map.Entry<String, Integer> entry : avenue.entrySet()) {
                System.out.println("Avenue : " + entry.getKey() + ", number: " + entry.getValue());
            }
        }


        public void addStreet(String streetName, Integer number) {

            streets.put(streetName, number);
        }

        public void deleteStreet(String streetName) {

            streets.remove(streetName);
        }

        public void printStreet() {
            for (Map.Entry<String, Integer> entry : streets.entrySet()) {
                System.out.println("Street : " + entry.getKey() + ", number: " + entry.getValue());
            }
        }

        public void addSquare(String squareName) {
            squares.add(squareName);
        }

        public void deleteSquare(String squareName) {
            squares.remove(squareName);
        }

        public void printSquare() {
            for (String square : squares) {
                System.out.println("Square : " + square);
            }
        }
    }
}
