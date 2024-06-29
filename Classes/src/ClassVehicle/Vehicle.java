package ClassVehicle;

public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private int fuel;

    public Vehicle(String type, String model, Engine engine,int fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public Vehicle setType(String type) {
        this.type = type;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Vehicle setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public int getFuel() {
        return fuel;
    }

    public Vehicle setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }

    public void drive(int fuelLoss){
        setFuel(this.fuel -= fuelLoss);
    }
}
