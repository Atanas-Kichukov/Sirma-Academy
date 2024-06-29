import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];

        List<Integer> zeroRow = new ArrayList<>();
        List<Integer> zeroCol = new ArrayList<>();

        for (int row = 0; row < rows; row++) {


            int[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();


            for (int col = 0; col < cols; col++) {
                if (values[col] == 0) {
                    zeroRow.add(row);
                    zeroCol.add(col);
                }
                matrix[row][col] = values[col];

            }

        }

        for (int index = 0; index < zeroRow.size(); index++) {

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (row == zeroRow.get(index) || col == zeroCol.get(index)) {
                        matrix[row][col] = 0;
                    }
                }
            }

        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }
    }
}
