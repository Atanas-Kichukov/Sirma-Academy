import java.util.*;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();

        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;

        for (int i : input) {
            if (i < 0) {
                countNegativeNumbers++;
            } else {
                countPositiveNumbers++;
            }
        }

        int[] negativeArr = new int[countNegativeNumbers];
        int[] positiveArr = new int[countPositiveNumbers];
        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                negativeArr[negativeIndex] = input[i];
                negativeIndex++;
            } else {
                positiveArr[positiveIndex] = input[i];
                positiveIndex++;
            }
        }

        int temp = 0;
        for (int i = 1; i < negativeArr.length; i++) {
            temp = negativeArr[i ];
            negativeArr[i] = negativeArr[i-1];
            negativeArr[i - 1] = temp;
        }

        for (int i : negativeArr) {
            System.out.println(i);
        }
        for (int i : positiveArr) {
            System.out.println(i);
        }

    }
}