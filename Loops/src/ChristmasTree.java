import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfChristmasTree = Integer.parseInt(scanner.nextLine());
        int countOfWhiteSpaces = 0;
        int bonusAsterisks = 0;

        for (int row = 1; row <= sizeOfChristmasTree + 1; row++) {

            countOfWhiteSpaces = sizeOfChristmasTree - row;

            for (int whiteSpaces = 0; whiteSpaces <= countOfWhiteSpaces; whiteSpaces++) {
                System.out.print(" ");
            }
            if (row == 1) {
                System.out.print(" | ");
            } else {
                for (int leftAsterisks = 0; leftAsterisks < row; leftAsterisks++) {
                    if (leftAsterisks == row - 1) {
                        System.out.print(" | ");
                    } else {
                        System.out.print("*");
                    }
                }

                for (int rightAsterisks = 0; rightAsterisks < row - 1; rightAsterisks++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
