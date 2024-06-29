import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChessboardCheckers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        List<Integer> queenRows = new ArrayList<>();
        List<Integer> queenCols = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
                if (values[col] == 1) {
                    queenRows.add(row);
                    queenCols.add(col);
                }
            }
        }

        for (int queenRow = 0; queenRow < queenRows.size(); queenRow++) {
            int indexRow = queenRows.get(queenRow);
            int indexCol = queenCols.get(queenRow);
            int counterOfQueensOnRow = 0;

          //  System.out.println("BotToTop");
            for (int row = rows - 2, col = cols - 1; row > indexRow && col > indexCol; row--, col--) {
            //    System.out.print(matrix[row][col] + " ");
                if (matrix[row][col] == 1) {
                    counterOfQueensOnRow++;
                }
            }
           // System.out.println();
           // System.out.println("TopToBot");
            for (int row = 0, col = 0; row < indexRow && col < indexCol; row++, col++) {
           //     System.out.print(matrix[row][col] + " ");
                if (matrix[row][col] == 1) {
                    counterOfQueensOnRow++;
                }
            }
         //   System.out.println();
          //  System.out.println("Vertical");
            for (int col = 0; col < cols; col++) {
          //     System.out.print(matrix[indexRow][col] + " ");
                if (matrix[indexRow][col] == 1) {
                    counterOfQueensOnRow++;
                }
            }
           // System.out.println();
          //  System.out.println("Horizontal");
            for (int row = 0; row < rows; row++) {
            //    System.out.print(matrix[row][indexCol] + " ");
                if (matrix[row][indexCol] == 1) {
                    counterOfQueensOnRow++;
                }
            }
       //     System.out.println(counterOfQueensOnRow);
            if(counterOfQueensOnRow > 2){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
