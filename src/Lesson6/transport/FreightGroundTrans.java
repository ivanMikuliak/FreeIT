package Lesson6.transport;

public class FreightGroundTrans extends GroundTrans {
    private double carryingCapacity;

    public FreightGroundTrans(int power, int speed, String mark, int tyreCount, double fuelEconomy, double carryingCapacity) {
        super(power, speed, mark, tyreCount, fuelEconomy);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void characteristic() {
        System.out.println(this.getPower() + " " + this.getSpeed() + "" + this.getMark() + "" +
                this.getTyreCount() + "" + this.getFuelEconomy() + "" + this.getCarryingCapacity());
    }


    public void cargoLoading(double cargoWeight) {
        if (this.getCarryingCapacity() > cargoWeight) {
            System.out.println("Track loaded.");
        } else {
            System.out.println("Toy need a bigger truck.");
        }
    }
}
