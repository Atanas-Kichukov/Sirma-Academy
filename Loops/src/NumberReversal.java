import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String result = "";
        while (number > 0) {

            result += number % 10;

            number /= 10;
        }
        System.out.println(result);
    }
}
