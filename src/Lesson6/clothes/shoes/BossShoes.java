package Lesson6.clothes.shoes;

public class BossShoes implements Shoes {
    public String putOn() {
        return "boss shoes";
    }

    @Override
    public String takeOff() {
        return "boss shoes";
    }
}
