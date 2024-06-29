import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int sum = 0;
        for (int row = 0; row <rows; row++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                sum += values[col];

            }

        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
