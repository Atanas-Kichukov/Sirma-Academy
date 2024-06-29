import java.util.Scanner;

public class LeftArrowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int countWhiteSpaces = 0;


        for (int row = 1; row < size; row++) {
            countWhiteSpaces = size - row;

            for (int spaces = 1; spaces < countWhiteSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = size - 2; row > 0 ; row--) {
            countWhiteSpaces = size - 1 - row  ;
            for (int spaces = 0; spaces < countWhiteSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
