package Lesson6.transport;

public class CivilAirTrans extends AirTrans {
    private int passengerCount;
    private boolean businessSeats;

    public CivilAirTrans(int power, int speed, String mark, int wingspan, int passengerCount, boolean businessSeats) {
        super(power, speed, mark, wingspan);
        this.passengerCount = passengerCount;
        this.businessSeats = businessSeats;
    }

    public boolean isBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(boolean businessSeats) {
        this.businessSeats = businessSeats;
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
                this.getPassengerCount() + "" + this.isBusinessSeats());
    }

    public void passengerLoading(int passengerCount) {
        if (this.getPassengerCount() > passengerCount) {
            System.out.println("Plane loaded.");
        } else {
            System.out.println("You need a bigger plane.");
        }
    }
}
