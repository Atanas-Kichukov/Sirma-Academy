import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        while (input > 0) {
            int lastDigit = input % 10;
            char symbol = (char) (lastDigit + 33);
            if (lastDigit == 0) {
                System.out.print("ZERO");
            } else {
                for (int i = 0; i < lastDigit; i++) {
                    System.out.print(symbol);
                }
            }
            System.out.println();
            input /= 10;
        }
    }
}
