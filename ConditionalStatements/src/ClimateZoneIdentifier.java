import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double latitude = Double.parseDouble(scanner.nextLine());
        String hemisphere = scanner.nextLine();
        String output = "";

        if (latitude >= -90 && latitude <= 90 && latitude != 0) {
            if (Math.abs(latitude) > 66.5) {
                output = "Arctic Zone";
            } else if (Math.abs(latitude) > 23.5) {
                output = "Temparate Zone";
            } else if (Math.abs(latitude) > 0) {
                output = "Tropic Zone";
            }
        } else {
            output = "Equator";
        }
        System.out.println(output + " " + hemisphere);
    }
}
