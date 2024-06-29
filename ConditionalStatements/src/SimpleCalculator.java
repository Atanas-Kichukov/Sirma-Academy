import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double result = 0;
        switch (operation){
            case "add":
                result = firstNum + secondNum;
                break;
            case "subtract":
                result = firstNum - secondNum;
                break;
            case "divide":
                result = firstNum / secondNum;
                break;
            case "multiply":
                result = firstNum * secondNum;
                break;
        }
        System.out.printf("%.2f",result);
    }
}
