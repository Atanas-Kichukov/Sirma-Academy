import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                        .split("[, ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index = 0;
        int[] output = new int[input.length / 2];

        for (int i = 0; i < input.length; i++) {
            if (i % 2 != 0) {
                output[index] = input[i];
                index++;
            }
        }

        for (int i = output.length - 1; i >= 0; i--) {
            System.out.print(output[i] * 2 + " ");
        }
    }
}
