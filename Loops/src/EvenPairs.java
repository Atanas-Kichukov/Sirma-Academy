import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int firstDifference = Integer.parseInt(scanner.nextLine());
        int secondDifference = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        int firstSum = firstDifference + firstPair;
        int secondSum = secondDifference + secondPair;

        List<Integer> firstPrimeNumbers = new ArrayList<>();
        List<Integer> secondPrimeNumbers = new ArrayList<>();


        for (int i = firstPair; i <= firstSum; i++) {
            for (int j = 1; j <= firstSum; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter < 3) {
                firstPrimeNumbers.add(i);
            }
            counter = 0;
        }

        for (int i = secondPair; i <= secondSum; i++) {
            for (int j = 1; j <= secondSum; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter < 3) {
                secondPrimeNumbers.add(i);
            }
            counter = 0;
        }

        for (Integer primeNumber : firstPrimeNumbers) {
            for (Integer secondPrimeNumber : secondPrimeNumbers) {
                System.out.println(primeNumber + "" + secondPrimeNumber);
            }
        }

    }
}
