import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArrow = Integer.parseInt(scanner.nextLine());
        int countOfWhiteSpaces = 0;
        for (int row = 1; row < sizeOfArrow; row++) {
            countOfWhiteSpaces = sizeOfArrow - row;

            for (int spaces = 0; spaces < countOfWhiteSpaces - 1; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int firstRowSpaces = sizeOfArrow - 2;
        int spacesForSecondFigure = firstRowSpaces - (firstRowSpaces / 2);

        for (int rowSecondFigure = 0; rowSecondFigure < sizeOfArrow - 1; rowSecondFigure++) {

            for (int spaces = 0; spaces < spacesForSecondFigure ; spaces++) {
                System.out.print(" ");
            }
            if (sizeOfArrow % 2 == 0) {
                for (int asterisks = 0; asterisks < firstRowSpaces + 1; asterisks++) {
                    System.out.print("*");
                }
            }else{
                for (int asterisks = 0; asterisks < firstRowSpaces; asterisks++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
// 4 - (4/2) = 4 - 2 = 2