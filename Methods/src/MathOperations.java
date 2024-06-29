import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        double secondNumber = Double.parseDouble(scanner.nextLine());

        calculate(firstNumber, symbol, secondNumber);


    }

    private static void calculate(double firstNumber, char symbol, double secondNumber) {

        switch (symbol) {
            case '+':
                System.out.printf("%.2f", firstNumber + secondNumber);
                break;
            case '-':
                System.out.printf("%.2f", firstNumber - secondNumber);
                break;

            case '/':
                System.out.printf("%.2f", firstNumber / secondNumber);
                break;

            case '*':
                System.out.printf("%.2f", firstNumber * secondNumber);
                break;
        }
    }
}
