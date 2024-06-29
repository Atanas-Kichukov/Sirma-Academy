import java.util.Scanner;

public class RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfAsterisks = Integer.parseInt(scanner.nextLine());
        int numberOfWhiteSpaces = 0;


        for (int i = 1; i <= numberOfAsterisks; i++) {
            numberOfWhiteSpaces = numberOfAsterisks - i;

            for (int space = 0; space < numberOfWhiteSpaces; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = numberOfAsterisks - 1; i > 0; i--) {
            numberOfWhiteSpaces = numberOfAsterisks - i;

            for (int space = 0; space < numberOfWhiteSpaces; space++) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
