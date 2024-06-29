import java.util.Arrays;
import java.util.Scanner;

public class ExcelSumFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
            }
        }
        String[] range = scanner.nextLine().split(":");
        String beginning = range[0];
        String end = range[1];

        int rowBeginning = Integer.parseInt((beginning.substring(1))) - 1;
        int colBeginning = beginning.charAt(0) - 'A';
        int rowEnd = Integer.parseInt((end.substring(1))) ;
        int colEnd = end.charAt(0) - 'A';

        int sum = 0;
        for (int col = colBeginning; col <= colEnd; col++) {
            for (int row = rowBeginning ; row < rowEnd ; row++) {
                sum += matrix[row][col];
            }
        }

        System.out.println(sum);
    }
}
