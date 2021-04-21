package Lesson6.transport;

public abstract class AirTrans extends Transport {
    private int wingspan;

    public AirTrans(int power, int speed, String mark, int wingspan) {
        super(power, speed, mark);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}
