import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vegetable = scanner.nextLine();
        String day = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        double bill = 0.0;

        switch (day) {
            default:
                System.out.println("error");
                return;

            case "Saturday":
            case "Sunday":
                switch (vegetable) {
                    case "tomato":
                        price = 2.80;
                        bill = price * quantity;
                        break;
                    case "onion":
                        price = 1.30;
                        bill = price * quantity;
                        break;
                    case "lettuce":
                        price = 0.85;
                        bill = price * quantity;
                        break;
                    case "cucumber":
                        price = 1.75;
                        bill = price * quantity;
                        break;
                    case "pepper":
                        price = 3.50;
                        bill = price * quantity;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (vegetable) {
                    case "tomato":
                        price = 2.50;
                        bill = price * quantity;
                        break;
                    case "onion":
                        price = 1.20;
                        bill = price * quantity;
                        break;
                    case "lettuce":
                        price = 0.85;
                        bill = price * quantity;
                        break;
                    case "cucumber":
                        price = 1.45;
                        bill = price * quantity;
                        break;
                    case "pepper":
                        price = 5.50;
                        bill = price * quantity;
                        break;
                    default:
                        System.out.println("error");
                        return;
                }
                break;
        }
        System.out.printf("%.2f", bill);
    }
}
