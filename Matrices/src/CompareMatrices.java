import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstDimension = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrixA = new int[firstDimension[0]][firstDimension[1]];

        for (int row = 0; row < firstDimension[0]; row++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrixA[row] = values;
        }

        int[] secondDimension = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        if (firstDimension[0] != secondDimension[0] || firstDimension[1] != secondDimension[1]) {
            System.out.println("not equal");
            return;
        }

        int[][] matrixB = new int[secondDimension[0]][secondDimension[1]];

        for (int row = 0; row < secondDimension[0]; row++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrixB[row] = values;
        }

        for (int row = 0; row < firstDimension[0]; row++) {
            for (int col = 0; col < firstDimension[1]; col++) {

                if(matrixA[row][col] != matrixB[row][col]){
                    System.out.println("not equal");
                    return;
                }

            }
        }
        System.out.println("equal");
    }
}