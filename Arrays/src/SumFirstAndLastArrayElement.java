import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        int sum = input[0] + input[input.length - 1];
        System.out.println(sum);

    }
}