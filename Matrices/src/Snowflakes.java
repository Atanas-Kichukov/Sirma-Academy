import java.util.Arrays;
import java.util.Scanner;

public class Snowflakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col].charAt(0);
            }
        }

        for (int row = 1; row < rows; row++) {
            char temp =' ';
            for (int col = 0; col < cols; col++) {
                if (matrix[row - 1][col] == '*' && matrix[row][col] != '#') {
                    temp = matrix[row][col];
                    matrix[row][col] = '*';
                    matrix[row - 1][col] = temp;
                }

            }
         printMatrix(matrix,rows,cols);
        }
        System.out.println();
    }
    public static void printMatrix(char[][] matrix,int rows, int cols){
        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("=======");
    }
}