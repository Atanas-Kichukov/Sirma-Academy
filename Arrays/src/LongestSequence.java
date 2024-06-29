import java.util.Arrays;
import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int digit = 0;
        int maxLength = 0;
        int currentLength = 1;
        int index = 0;
        int currentIndex = 0;

        for (int i = 0; i < input.length - 1; i++) {

            if (input[i] == input[i + 1]) {

                if(currentLength == 1){
                    currentIndex = i;
                }

                currentLength++;

                if (currentLength >= maxLength) {
                    maxLength = currentLength;
                    if (currentIndex >= index) {
                        digit = input[i];
                        index = currentIndex;
                    }

                }

            } else {
                currentLength = 1;
            }



        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(digit);
        }
    }
}
