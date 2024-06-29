import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RowAndColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];
        List<String> rowSum = new ArrayList<>();
        List<String> colSum = new ArrayList<>();


        for (int row = 0; row < rows; row++) {
            int sum = 0;
            int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
                sum += matrix[row][col];
            }
            rowSum.add("" +sum);
        }

        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += matrix[row][col];
            }
            colSum.add("" + sum);
        }

        String allRowsSum = String.join(",",rowSum);
        String allColsSum = String.join(",",colSum);
        System.out.printf("Row Sums:%s%n" +
                "Column Sums:%s",allRowsSum,allColsSum);
    }
}
