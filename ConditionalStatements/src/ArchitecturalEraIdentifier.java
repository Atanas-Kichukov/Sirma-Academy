import java.time.Year;
import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        String material = scanner.nextLine();
        switch (material) {
            case "wood":
                if (year >= 1500 && year <= 1800) {
                    System.out.println("Colonial");
                } else {
                    System.out.println("Uncertain");
                }
                break;
            case "stone":
                if (year < 500) {
                    System.out.println("Ancient");
                } else if (year <= 1500) {
                    System.out.println("Medieval");
                } else {
                    System.out.println("Uncertain");
                }
                break;
            case "steel":
                if (year >= 1800 && year <= 1900) {
                    System.out.println("Industrial");
                } else if (year > 1900) {
                    System.out.println("Modern");
                } else {
                    System.out.println("Uncertain");
                }
                break;


        }
    }
}
