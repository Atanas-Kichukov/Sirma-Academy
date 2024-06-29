package ClassVehicle;

public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public Engine setPower(int power) {
        this.power = power;
        return this;
    }
}
