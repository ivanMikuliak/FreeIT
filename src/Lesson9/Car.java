package Lesson9;

public class Car {

    private String brand;
    private int speed;
    private int coast;

    public Car() {
    }

    public Car(String brand, int speed, int coast) {
        this.brand = brand;
        this.speed = speed;
        this.coast = coast;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public void start() throws IvanException {
        if (((int) (Math.random() * 21)) % 2 == 0) {
            throw new IvanException(this.getBrand() + " broke down!");
        } else {
            System.out.println(this.getBrand() + " had started!");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 125, 25000);
        Car car2 = new Car("LADA", 240, 12000);
        try {
            car1.start();
        } catch (IvanException e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.start();
        } catch (IvanException e) {
            System.out.println(e.getMessage());
        }
    }
}