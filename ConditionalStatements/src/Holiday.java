import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0;

        if(budget>1000){
            price = budget * 0.9;
            System.out.println("Somewhere in Asia");
            System.out.printf("Hotel - %.2f",price);
            return;
        }

        switch (season) {
            case "summer":
                if (budget <= 100){
                    price = budget * 0.3;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f",price);
                }else if(budget<=1000){
                    price = budget * 0.4;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Camp - %.2f",price);
                }
                    break;
            case "winter":
                if (budget <= 100){
                    price = budget * 0.7;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f",price);
                }else if (budget <=1000){
                    price = budget * 0.8;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",price);
                }
                break;
            default:
                price = budget * 0.9;
                System.out.println("Somewhere in Asia");
                System.out.printf("Hotel - %.2f",price);
        }
       // System.out.println(50 * 0.3);
    }

}
