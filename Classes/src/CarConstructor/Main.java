package CarConstructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfCars = Integer.parseInt(scanner.nextLine());
        String brand;
        String model;
        Integer horsepower;
        Car car;
        for (int i = 0; i < countOfCars; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            if (carInfo.length <= 1) {
                brand = carInfo[0];
                car = new Car(brand);
            } else if (carInfo.length <= 2) {
                brand = carInfo[0];
                model = carInfo[1];
                car = new Car(brand, model);

            } else {
                brand = carInfo[0];
                model = carInfo[1];
                horsepower = Integer.parseInt(carInfo[2]);
                car = new Car(brand, model, horsepower);
            }

            car.getInfo();
        }

    }
}
