import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsAndCols = input[0];
        int[][] matrix = new int[rowsAndCols][rowsAndCols];
        int sum = 0;

        for (int row = 0; row < rowsAndCols; row++) {

            int[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            for (int col = 0; col < rowsAndCols; col++) {
                matrix[row][col] = values[col];
            }

        }


        for (int row = 0; row < rowsAndCols; row++) {
            sum +=(matrix[row][row]);
        }

        for (int row = rowsAndCols - 1,col = 0; row >= 0; row--,col++) {

            sum +=(matrix[row][col]);
        }
        System.out.println(sum);
    }
}
