package Lesson6.cosmodrome;

public class SpaceX implements IStart {
    @Override
    public boolean testSystem() {
        if ((int) (Math.random() * 11) > 3) return true;
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}