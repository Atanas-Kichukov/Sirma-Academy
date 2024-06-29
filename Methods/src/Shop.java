import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());


        bill(product, quantity);
    }

    private static void bill(String product, int quantity) {

        switch (product) {
            case "coffee":
                System.out.printf("%.2f",quantity*1.50);
                break;
            case "water":
                System.out.printf("%.2f",quantity*1.00);
                break;
            case "coke":
                System.out.printf("%.2f",quantity*1.40);
                break;
            case "snacks":
                System.out.printf("%.2f",quantity*2.00);
                break;
        }
    }
}
