import java.util.Arrays;
import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int countOfPreviousElements = Integer.parseInt(scanner.nextLine());
        int output[] = new int[sizeOfArray];
        int numToAdd = 0;
        output[0] = 1;


        for (int i = 1; i < sizeOfArray; i++) {
            if (i < countOfPreviousElements) {
                for (int j = 0; j < i; j++) {
                    numToAdd += output[j];
                }
                output[i] = numToAdd;
            } else {
                for (int j = i - countOfPreviousElements; j < i; j++) {
                    numToAdd += output[j];
                }
                output[i] = numToAdd;
            }
            numToAdd = 0;
        }
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
// 6
// 3
// 1 1 2 4 7 13