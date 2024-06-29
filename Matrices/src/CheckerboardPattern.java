import java.util.Scanner;

public class CheckerboardPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndCols = Integer.parseInt(scanner.nextLine());
        int[][] checkerBoard = new int[rowsAndCols][rowsAndCols];

        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                if(row % 2 ==0){
                    if(col % 2 == 0){
                        checkerBoard[row][col] = 0;
                    }else {
                        checkerBoard[row][col] = 1;
                    }
                }else{
                    if(col % 2 != 0){
                        checkerBoard[row][col] = 0;
                    }
                    else{
                        checkerBoard[row][col] = 1;
                    }
                }
                System.out.print(checkerBoard[row][col] + " ");
            }
            System.out.println();

        }



    }
}
