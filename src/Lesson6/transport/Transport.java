package Lesson6.transport;

public abstract class Transport {

    private int power;
    private int speed;
    private String mark;

    public Transport(int power, int speed, String mark) {
        this.power = power;
        this.speed = speed;
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public abstract void characteristic();

}
