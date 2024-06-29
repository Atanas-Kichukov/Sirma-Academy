package CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfCars; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String brand = carInfo[0];
            String model = carInfo[1];
            int horsepower = Integer.parseInt(carInfo[2]);
            Car car = new Car(brand,model,horsepower);
            car.getInfo();
        }
    }
}
