package Lesson6.transport;

public class MilitaryAirTrans extends AirTrans {
    private boolean catapultExist;
    private int rocketCount;

    public MilitaryAirTrans(int power, int speed, String mark, int wingspan, boolean catapultExist, int rocketCount) {
        super(power, speed, mark, wingspan);
        this.catapultExist = catapultExist;
        this.rocketCount = rocketCount;
    }

    public boolean isCatapultExist() {
        return catapultExist;
    }

    public void setCatapultExist(boolean catapultExist) {
        this.catapultExist = catapultExist;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    @Override
    public void characteristic() {
        System.out.println(this.getPower() + " " + this.getSpeed() + "" + this.getMark() + "" +
                this.getRocketCount() + "" + this.isCatapultExist());
    }

    public void shoot() {
        if (this.getRocketCount() > 0) {
            System.out.println("Rocket went off...");
        } else {
            System.out.println("No ammunition.");
        }
    }

    public void catapult() {
        if (this.isCatapultExist()) {
            System.out.println("Catapulting was successful.");
        } else {
            System.out.println("You don't have such a system.");
        }
    }
}
