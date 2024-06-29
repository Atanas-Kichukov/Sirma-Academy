import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] firstMatrix = new int[rows][cols];
        int[][] secondMatrix = new int[rows][cols];
        int[][] thirdMatrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                firstMatrix[row][col] = rowOfMatrix[col];
            }
        }


        for (int row = 0; row < rows; row++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                secondMatrix[row][col] = rowOfMatrix[col];
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                thirdMatrix[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
                System.out.print(thirdMatrix[row][col] + " ");
            }
            System.out.println();
        }


    }
}
