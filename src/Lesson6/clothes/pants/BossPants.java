package Lesson6.clothes.pants;

public class BossPants implements Pants {
    public String putOn() {
        return "boss pants";
    }

    @Override
    public String takeOff() {
        return "boss pants";
    }
}
