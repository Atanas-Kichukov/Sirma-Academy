import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandAndNumber = scanner.nextLine();
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();


        while (!commandAndNumber.equals("END")) {
            String[] tokens = commandAndNumber.split(", ");
            String direction = tokens[0];
            String plateNumber = tokens[1];
            switch (direction) {
                case "IN":
                    parkingLot.add(plateNumber);
                    break;
                case "OUT":
                    parkingLot.remove(plateNumber);
                    break;
            }


            commandAndNumber = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }
    }
}
