package CarConstructor;

public class Car {
    private String brand;
    private String model = "unknown";
    private Integer horsepower = -1;


    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public Car setHorsepower(int horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public void getInfo() {
        System.out.printf("The car is: %s %s - %d HP.%n", this.brand, this.model, this.horsepower);
    }
}
