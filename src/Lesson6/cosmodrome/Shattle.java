package Lesson6.cosmodrome;

public class Shattle implements IStart {
    @Override
    public boolean testSystem() {
        if ((int) (Math.random() * 11) > 3) return true;
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
