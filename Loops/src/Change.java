import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int allCoins = 0;
        while (change > 0) {
            if(change >=2){
                change -=2;
                allCoins++;
            }
            else if (change >= 1) {
                change--;
                allCoins++;
            } else if (change >= 0.50) {
                change -= 0.50;
                allCoins++;
            } else if (change >= 0.20) {
                change -= 0.20;
                allCoins++;
            } else if (change >= 0.10) {
                change -= 0.10;
                allCoins++;
            } else if (change >= 0.05) {
                change -= 0.05;
                allCoins++;
            } else if (change >= 0.02) {
                change -= 0.02;
                allCoins++;
            } else {
                change -= 0.01;
                allCoins++;
            }
            change = Math.round(change * 100.0) / 100.0;
        }
        System.out.println(allCoins);

    }
}
