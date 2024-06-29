import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];
        char[][] thirdMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] parts = scanner.nextLine().split("\\s+");
            char[] symbols = new char[parts.length];

            for (int s = 0; s < parts.length; s++) {
                symbols[s] = parts[s].charAt(0);
            }

            for (int col = 0; col < cols; col++) {
            firstMatrix[row][col] = symbols[col];

            }
        }

        for (int row = 0; row < rows; row++) {
            String[] parts = scanner.nextLine().split("\\s+");
            char[] symbols = new char[parts.length];

            for (int s = 0; s < parts.length; s++) {
                symbols[s] = parts[s].charAt(0);
            }

            for (int col = 0; col < cols; col++) {
                secondMatrix[row][col] = symbols[col];

            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(firstMatrix[row][col] != secondMatrix[row][col]){
                    thirdMatrix[row][col] = '*';
                    System.out.print(thirdMatrix[row][col] + " ");
                }else{
                    thirdMatrix[row][col] = firstMatrix[row][col];
                    System.out.print(thirdMatrix[row][col] + " ");
                }
            }
            System.out.println();
        }


    }
}
