import java.util.Arrays;
import java.util.Scanner;

public class MatrixBoundarySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int row = 0; row < rows; row++) {

            int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
                if (row == 0 || row == rows - 1 || col == 0 || col == cols - 1) {
                    sum += matrix[row][col];
                }
            }

        }
        System.out.println(sum);
    }
}
