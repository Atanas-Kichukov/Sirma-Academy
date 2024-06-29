import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());


        multiplyEvensByOdds(num);


    }

    private static void multiplyEvensByOdds(int num) {
        int evenSum = 0;
        int oddSum = 0;
        int lastNumber = 0;
        while (num > 0) {
            lastNumber = num % 10;
            if (lastNumber % 2 == 0) {
                evenSum += lastNumber;
            } else {
                oddSum += lastNumber;
            }

            num /= 10;
        }
        System.out.println(evenSum*oddSum);
    }
}
