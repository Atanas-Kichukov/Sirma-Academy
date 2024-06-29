import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");


        int rowsAndCols = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[rowsAndCols][rowsAndCols];
        int numToAdd = 0;

        if (pattern.equals("A")) {
            for (int col = 0; col < rowsAndCols; col++) {
                for (int row = 0; row < rowsAndCols; row++) {
                    matrix[row][col] = ++numToAdd;
                }
            }
        }
        else {
            for (int col = 0; col < rowsAndCols; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < rowsAndCols; row++) {
                        matrix[row][col] = ++numToAdd;
                    }
                } else {
                        for (int row = rowsAndCols - 1; row >= 0; row--) {
                            matrix[row][col] = ++numToAdd;
                    }

                }
            }
        }


        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }
    }
}
