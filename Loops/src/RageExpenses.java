import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expenses = 0.0;

        int brokenHeadsets = lostGames / 2;
        int brokenMouses = lostGames / 3;
        int brokenKeyboards = Math.abs(brokenMouses - brokenHeadsets);
        int brokenDisplays = brokenKeyboards / 2;

        expenses = brokenHeadsets * headsetPrice +
                brokenMouses * mousePrice +
                brokenKeyboards * keyboardPrice +
                brokenDisplays * displayPrice;

        System.out.printf("Rage expenses: %.2flv.",expenses);
    }
}
