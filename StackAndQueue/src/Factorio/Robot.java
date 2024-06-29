package Factorio;

public class Robot {
    private String name;
    private int time;
    private String material = "";

    public Robot(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public Robot setName(String name) {
        this.name = name;
        return this;
    }

    public int getTime() {
        return time;
    }

    public Robot setTime(int time) {
        this.time = time;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Robot setMaterial(String material) {
        this.material = material;
        return this;
    }
}
