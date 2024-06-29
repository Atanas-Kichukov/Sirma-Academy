import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] information = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numberOfElementsToPush = information[0];
        int numberOfElementsToPop = information[1];
        int numberToCheck = information[2];


        ArrayDeque<Integer> output = new ArrayDeque<>();
        int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfElementsToPush; i++) {
            output.push(input[i]);
        }
        for (int i = 0; i < numberOfElementsToPop; i++) {
            output.pop();
        }

        if (output.contains(numberToCheck)) {
            System.out.println("true");
        } else if (output.isEmpty()) {
            System.out.println(0);
        } else {
            for (int i = 0; i < output.size(); i++) {
                int number = output.pop();
                if (smallestNum > number) {
                    smallestNum = number;
                }
            }
            System.out.println(smallestNum);
        }


    }
}
