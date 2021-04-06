package Lesson6.transport;

public class PassengerGroundTrans extends GroundTrans {
    private String bodyType;
    private int passengerCount;

    public PassengerGroundTrans(int power, int speed, String mark, int tyreCount,
                                double fuelEconomy, String bodyType, int passengerCount) {
        super(power, speed, mark, tyreCount, fuelEconomy);
        this.bodyType = bodyType;
        this.passengerCount = passengerCount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public void characteristic() {
        System.out.println(this.getPower() + " " + this.getSpeed() + "" + this.getMark() + "" +
                this.getTyreCount() + "" + this.getFuelEconomy() + "" + this.getBodyType() + "" + this.getPassengerCount());
    }

    private double fuelConsumption(double time) {
        return 14*time;
    }

    public void maxDistance(double time) {
        System.out.println("За время " + time + " часа, автомобиль " + this.getMark() + " двигаясь с максимальной скоростью " +
                this.getSpeed() + " израсходует " + this.fuelConsumption(time));
    }
}
