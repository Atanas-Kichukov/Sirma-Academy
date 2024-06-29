import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingWithCars = new LinkedHashMap<>();
        String username = "";
        while (numberOfCommands > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];


            switch (command) {
                case "Register":
                     username = tokens[1];
                    String plateNumber = tokens[2];
                    if (parkingWithCars.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                    } else {
                        parkingWithCars.putIfAbsent(username, plateNumber);
                        System.out.printf("%s registered %s successfully.%n", username, plateNumber);
                    }
                    break;
                case "Unregister":
                     username = tokens[1];
                    if (!parkingWithCars.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found.%n", username);
                    } else {
                        String removedUser = parkingWithCars.remove(username);
                        System.out.printf("%s unregistered successfully.%n", username);
                    }
                    break;
            }


            numberOfCommands--;
        }

        for (Map.Entry<String, String> entry : parkingWithCars.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
