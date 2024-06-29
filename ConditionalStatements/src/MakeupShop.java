import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renovationPrice = Double.parseDouble(scanner.nextLine());
        int countOfPowders = Integer.parseInt(scanner.nextLine());
        int countOfLipsticks = Integer.parseInt(scanner.nextLine());
        int countOfSpirals = Integer.parseInt(scanner.nextLine());
        int countOfShadows = Integer.parseInt(scanner.nextLine());
        int countOfCorrectors = Integer.parseInt(scanner.nextLine());

        double bill = ((countOfPowders * 2.6) + (countOfLipsticks * 3)
                + (countOfSpirals * 4.10) + (countOfShadows * 8.2) + (countOfCorrectors * 2));

        int allProducts = countOfPowders + countOfCorrectors + countOfLipsticks + countOfSpirals + countOfShadows;

        if (allProducts >= 50) {
            bill = bill - (bill * 0.25);
        }
        bill = bill - (bill * 0.1);

        if(bill >= renovationPrice){
            System.out.printf("Yes! %.2f lv left",bill - renovationPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed",renovationPrice - bill);
        }
    }
}
