import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] rectangle = new int[rows][cols];
        int sum = 0;


        for (int row = 0; row < rows; row++) {
            int[]values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                rectangle[row][col] = values[col];
            }
        }
        int beginRow = 0;
        int beginCol =0;
        for (int row = 0; row < rows- 2; row++) {
            int currentValue = 0;
            for (int col = 0; col < cols - 2; col++) {
                currentValue = rectangle[row][col] + rectangle[row][col + 1] + rectangle [row][col + 2]
                + rectangle[row + 1][col] + rectangle[row + 1][col + 1] + rectangle [row + 1][col + 2]
                        + rectangle[row + 2][col] + rectangle[row + 2][col + 1] + rectangle [row +2][col + 2];
                if(currentValue>sum){
                    sum = currentValue;
                    beginRow = row;
                    beginCol = col;
                }
            }

        }
        System.out.println(sum);
        for (int row = beginRow; row < beginRow + 3 ; row++) {
            for (int col = beginCol; col < beginCol + 3; col++) {
                System.out.print(rectangle[row][col] + " ");
            }
            System.out.println();
        }




        System.out.println();
    }
}
