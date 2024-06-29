import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseHeight = Integer.parseInt(scanner.nextLine());

        if (houseHeight % 2 != 0) {
            for (int i = 1; i <= houseHeight; i+=2) {

                for (int j = 1; j <= houseHeight - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            for (int i = 2; i <= houseHeight; i+=2) {
                for (int j = 1; j <= houseHeight- i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < houseHeight; j++) {
                if (j == 0 || j == houseHeight - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
