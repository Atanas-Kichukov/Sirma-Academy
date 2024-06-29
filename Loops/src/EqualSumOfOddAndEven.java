import java.util.Scanner;

public class EqualSumOfOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int oddSum = 0;
        int evenSum = 0;
        int printedNumbers = 0;
        for (int i = firstNumber; i < secondNumber; i++) {
            int numberToCheck = i;

            while (numberToCheck > 0) {

                if (counter % 2 != 0) {
                    oddSum += numberToCheck % 10;
                } else {
                    evenSum += numberToCheck % 10;
                }

                numberToCheck /= 10;
                counter++;
            }
            if (oddSum == evenSum) {
                System.out.println(i);
                printedNumbers++;
            }
            counter = 1;
            oddSum = 0;
            evenSum = 0;
        }
        if(printedNumbers == 0){
            System.out.println("None");
        }
    }
}
