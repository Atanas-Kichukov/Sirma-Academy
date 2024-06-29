import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNum, secondNum);

                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum,secondNum);
                break;
            case "divide":
                divide(firstNum,secondNum);
                break;

        }


    }

    private static void divide(int firstNum, int secondNum) {
        System.out.println(firstNum/secondNum);
    }

    private static void subtract(int firstNum, int secondNum) {
        System.out.println(firstNum-secondNum);
    }

    private static void multiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    private static void add(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
}
