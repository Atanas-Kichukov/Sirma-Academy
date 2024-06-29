import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        List<Integer> firstEvenNumbers = new ArrayList<>();
        List<Integer> secondEvenNumbers = new ArrayList<>();
        List<Integer> firstPrimeNumbers = new ArrayList<>();

        for (int i = 1; i <= firstNumber; i++) {
            if (i % 2 == 0) {
                firstEvenNumbers.add(i);
            }
        }

        for (int i = 2; i <= secondNumber; i++) {
            for (int j = 1; j <= secondNumber; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter < 3) {
                firstPrimeNumbers.add(i);
            }
            counter = 0;
        }


        for (int i = 1; i <= thirdNumber; i++) {
            if (i % 2 == 0) {
                secondEvenNumbers.add(i);
            }
        }

        for (Integer firstEvenNumber : firstEvenNumbers) {
            for (Integer firstPrimeNumber : firstPrimeNumbers) {
                for (Integer secondEvenNumber : secondEvenNumbers) {
                    System.out.println(firstEvenNumber + " " + firstPrimeNumber + " " + secondEvenNumber);
                }
            }
        }
    }
}
