import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positionOfFibonacci = Integer.parseInt(scanner.nextLine());

        System.out.println(getFibonacci(positionOfFibonacci - 1));
    }

    public static int getFibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        return getFibonacci(number - 1)
                +
                getFibonacci(number - 2);
    }
}
