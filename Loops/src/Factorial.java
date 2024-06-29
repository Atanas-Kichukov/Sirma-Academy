import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for (int i = number; i > 0 ; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
