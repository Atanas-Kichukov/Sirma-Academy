import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int countOfSymbols = 3;

        for (int row = 1; row <= steps; row++) {
            if (row > 2) {
                for (int spaces = 1; spaces < countOfSymbols -row - 1; spaces++) {
                    System.out.print(" ");

                }
            }
            for (int col = 0; col < row; col++) {
                System.out.print("#");
                countOfSymbols++;
            }

            System.out.println();
        }
    }
}
