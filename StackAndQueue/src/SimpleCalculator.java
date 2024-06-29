import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> calculator = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "+":
                    calculator.push(calculator.pop() + Integer.parseInt(input[i + 1]));
                    i = i + 1;
                    break;
                case "-":
                    calculator.push(calculator.pop() - Integer.parseInt(input[i + 1]));
                    i = i + 1;
                    break;
                default:
                    calculator.push(Integer.parseInt(input[i]));
            }

        }

        System.out.println(calculator.pop());

    }
}
