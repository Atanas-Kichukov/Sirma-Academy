import java.util.Scanner;

public class PyramidWithIncreasingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrows = Integer.parseInt(scanner.nextLine());
        int countWhiteSpaces =0;

        int rowCount = 1;


        for (int i = 1; i <= nrows; i++)
        {
            countWhiteSpaces = nrows - i;
            for (int whiteSpaces = 0; whiteSpaces < countWhiteSpaces; whiteSpaces++) {
                System.out.print("  ");
            }


            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(j+" ");
            }


            for (int j = rowCount-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();


            rowCount++;
        }
    }

}
