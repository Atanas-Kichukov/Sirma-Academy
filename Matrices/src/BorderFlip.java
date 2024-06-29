import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BorderFlip {
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


        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;



            int[] temp = new int[rows + (cols - 1) + (rows - 1) + (cols - 2)];
            int index = 0;

            //Storing the top row
            for (int i = 0; i <= right; i++) {
                temp[index++] = matrix[top][i];
            }
            //Storing the right row
            for (int i = 1; i <= bottom; i++) {
                temp[index++] = matrix[i][right];
            }
            //Storing the bottom row
            for (int i = right - 1; i >= 0; i--) {
                temp[index++] = matrix[bottom][i];
            }
            // Storing the left row. i>0 because we have the top left corner already
            for (int i = bottom - 1; i > 0; i--) {
                temp[index++] = matrix[i][left];
            }
            index = 0;

            //Placing the elements from top-right-bottom-left order.
            for (int i = 1; i <= right; i++) {
                matrix[top][i] = temp[index++];
            }
            for (int i = 1; i <= bottom; i++) {
                matrix[i][right] = temp[index++];
            }
            for (int i = right - 1; i >= 0; i--) {
                matrix[bottom][i] = temp[index++];
            }
            for (int i = bottom - 1; i >= 0; i--) {
                matrix[i][left] = temp[index++];
            }
            matrix[top][left] = temp[temp.length - 1];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}
