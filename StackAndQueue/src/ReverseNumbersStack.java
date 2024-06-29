import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> output = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            output.push(input[i]);
        }


        while (!output.isEmpty()){
            System.out.print(output.pop() + " ");


        }
    }
}
