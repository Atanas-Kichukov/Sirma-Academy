import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int numberOfElementsToAdd = Integer.parseInt(input[0]);
        int numberOfElementsToPoll = Integer.parseInt(input[1]);
        int numberToCheck = Integer.parseInt(input[2]);
        int smallestNumber = Integer.MAX_VALUE;

        int[] elements = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();


        for (int i = 0; i < numberOfElementsToAdd; i++) {
            queue.offer(elements[i]);
        }
        for (int i = 0; i < numberOfElementsToPoll; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        }
        else if (queue.contains(numberToCheck)) {
            System.out.println("true");
        }
        else {
            while (!queue.isEmpty()) {
                int numberToCompare = queue.poll();

                if (numberToCompare < smallestNumber) {
                    smallestNumber = numberToCompare;
                }

            }
            System.out.println(smallestNumber);
        }
    }
}
