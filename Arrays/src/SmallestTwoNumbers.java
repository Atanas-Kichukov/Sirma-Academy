import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
