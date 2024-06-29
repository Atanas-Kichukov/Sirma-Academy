import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double sum =0.0;

        switch (city){
            case"Sofia":
                switch (product){
                    case "tea":
                        sum = 0.5 * quantity;
                        break;
                    case "water":
                        sum = 0.8 * quantity;
                        break;
                    case"juice":
                        sum = 1.2 * quantity;
                        break;
                    case"sweets":
                        sum = 1.45 * quantity;
                        break;
                    case "chips":
                        sum = 1.60 * quantity;
                        break;
                }
                break;
            case"Plovdiv":
                switch (product){
                    case "tea":
                        sum = 0.4 * quantity;
                        break;
                    case "water":
                        sum = 0.7 * quantity;
                        break;
                    case"juice":
                        sum = 1.15 * quantity;
                        break;
                    case"sweets":
                        sum = 1.30 * quantity;
                        break;
                    case "chips":
                        sum = 1.50 * quantity;
                        break;
                }
                break;
            case "Varna":
                switch (product){
                    case "tea":
                        sum = 0.45 * quantity;
                        break;
                    case "water":
                        sum = 0.7 * quantity;
                        break;
                    case"juice":
                        sum = 1.1 * quantity;
                        break;
                    case"sweets":
                        sum = 1.35 * quantity;
                        break;
                    case "chips":
                        sum = 1.55 * quantity;
                        break;
                }
                break;
        }
        System.out.printf("%.2f",sum);
    }
}
