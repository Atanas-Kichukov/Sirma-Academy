import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length + 2; i++) {
            System.out.print("#");
        }

        System.out.println();

        for (int row = 1; row <= (length + 1) / 2; row++) {

            for (int whiteSpaces = 0; whiteSpaces < row; whiteSpaces++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int middleSpaces = 0; middleSpaces < length - 2 * row; middleSpaces++) {
                System.out.print(" ");
            }

            if (length - 2 * row >= 0) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int row = (length + 1) / 2 - 1; row >=1 ; row--) {

            for (int whiteSpace = 0; whiteSpace < row; whiteSpace++) {
                System.out.print(" ");
            }

            System.out.print("#");

            for (int middleSpace = 0; middleSpace < length - 2 * row; middleSpace++) {
                System.out.print(" ");
            }
            if(length - 2 * row >=0) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int base = 0; base < length + 2 ; base++) {
            System.out.print("#");
        }
    }
}
