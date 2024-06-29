import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndCols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rowsAndCols][rowsAndCols];


        for (int row = 0; row < rowsAndCols; row++) {

            int[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            for (int col = 0; col < rowsAndCols; col++) {
                matrix[row][col] = values[col];
            }

        }


        for (int row = 0; row < rowsAndCols; row++) {
            System.out.print(matrix[row][row] + " ");
//            for (int col = 0; col < rowsAndCols; col++) {
//                if(row == col){
//                    System.out.print(matrix[row][col] + " ");
//                }
//            }
        }

        System.out.println();
        for (int row = rowsAndCols - 1,col = 0; row >= 0; row--,col++) {

            System.out.print(matrix[row][col] + " ");
        }

    }
}
