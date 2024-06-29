import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Spiral {
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
        int middleElement = 0;

        List<int[]> cyclesOfRotation = new ArrayList<>();
        for (int i = 1; i <= Math.abs(rows/2); i++) {

            int top = i - 1;
            int bottom = matrix.length - i;
            int left = i - 1;
            int right = matrix[0].length - i;




            int[] temp = new int[(rows + (cols - i) + (rows - i) + (cols - i * 2))/i];
            int index = 0;

            //Storing the top row
            for (int y = i - 1; y <= right; y++) {
                temp[index++] = matrix[top][y];
            }
            //Storing the right row
            for (int j = i; j <= bottom; j++) {
                temp[index++] = matrix[j][right];
            }
            //Storing the bottom row
            for (int x = right - 1; x >= i - 1; x--) {
                temp[index++] = matrix[bottom][x];
            }
            // Storing the left row. i>0 because we have the top left corner already
            for (int z = bottom - i ; z > 0; z--) {
                temp[index++] = matrix[z][left];
            }
            cyclesOfRotation.add(temp);
        }


        for (int[] ints : cyclesOfRotation) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        if(rows % 2 != 0){
            middleElement = matrix[rows/2][cols/2];
            System.out.print(middleElement);
        }
    }


}
