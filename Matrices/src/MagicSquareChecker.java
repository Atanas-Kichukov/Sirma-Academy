import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MagicSquareChecker {
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
        List<Integer> rowSums = new ArrayList<>();
        List<Integer> colSums = new ArrayList<>();
        int diagonalFromTopToBot = 0;
        int diagonalFromBotToTop = 0;
        int sumOfCol = 0;
        int sumOfRow = 0;

        for (int row = 0; row < rows; row++) {
            sumOfRow = 0;
            sumOfCol = 0;
            for (int col = 0; col < cols; col++) {
                sumOfRow += matrix[row][col];
                sumOfCol += matrix[col][row];
            }
            if(sumOfCol != sumOfRow){
                System.out.println("False");
                return;
            }
            colSums.add(sumOfCol);
            rowSums.add(sumOfRow);
        }

        for (int row = 0; row < rows; row++) {
            diagonalFromTopToBot += matrix[row][row];
        }
        for (int row = rows - 1; row >= 0; row--) {
            diagonalFromBotToTop += matrix[row][row];
        }

        if(diagonalFromBotToTop != diagonalFromTopToBot){
            System.out.println("False");
            return;
        }

        for (int i = 0; i < rowSums.size() - 1; i++) {
            if ((rowSums.get(i) != rowSums.get(i + 1)) || (colSums.get(i) != colSums.get(i + 1))){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
