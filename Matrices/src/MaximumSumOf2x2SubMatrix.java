import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
            }

        }

        int maxSum = Integer.MIN_VALUE;

        int beginRow = 0;
        int beginCol = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentValue = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (maxSum < currentValue) {
                    maxSum = currentValue;
                    beginRow = row;
                    beginCol = col;
                }
            }
            
        }

        System.out.println(maxSum);
        for (int row = beginRow; row < beginRow + 2 ; row++) {
            for (int col = beginCol; col < beginCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}
