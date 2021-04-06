package Lesson6.transport;

public abstract class GroundTrans extends Transport {
    private int tyreCount;
    private double fuelEconomy;

    public GroundTrans(int power, int speed, String mark, int tyreCount, double fuelEconomy) {
        super(power, speed, mark);
        this.tyreCount = tyreCount;
        this.fuelEconomy = fuelEconomy;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public int getTyreCount() {
        return tyreCount;
    }

    public void setTyreCount(int tyreCount) {
        this.tyreCount = tyreCount;
    }
}
