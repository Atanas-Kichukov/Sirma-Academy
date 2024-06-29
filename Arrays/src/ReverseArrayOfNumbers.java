import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotations = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(",");
        String [] output = new String[rotations];

        for (int i = 0; i < rotations; i++) {
            output[i] = input[i];
        }
        for (int i = output.length - 1; i >= 0 ; i--) {
            System.out.print(output[i] + " ");

        }
    }
}
