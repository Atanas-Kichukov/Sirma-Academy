import java.util.Scanner;

public class PseudoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        int newFibonacci = 0;
        int result = 1;
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                newFibonacci = firstFibonacci + secondFibonacci;
                result += newFibonacci;
                firstFibonacci = secondFibonacci;
                secondFibonacci = newFibonacci;

            }
            System.out.println(result);
        }
        else {
            System.out.println(0);
        }

    }
}
