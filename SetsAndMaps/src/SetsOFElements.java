import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOFElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sizeOfA = input[0];
        int sizeOfB = input[1];

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> repeatingElements = new LinkedHashSet<>();
        for (int i = 0; i < sizeOfA ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < sizeOfB; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            if(firstSet.contains(element)){
                repeatingElements.add(element);
            }
        }
        for (Integer repeatingElement : repeatingElements) {
            System.out.print(repeatingElement + " ");
        }
    }
}
