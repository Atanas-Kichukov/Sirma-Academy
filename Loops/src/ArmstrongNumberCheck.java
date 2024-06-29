import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int number = input;
        double armstrongNumber = 0;
        String numberToString = String.valueOf(input);
        int multiplier = numberToString.length();

        while (input > 0) {
            armstrongNumber += Math.pow(input % 10, multiplier);
            input /= 10;
        }
        System.out.println(number == armstrongNumber);
    }
}
