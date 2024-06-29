import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfAsterisks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfAsterisks; i++) {

            for (int j = 0; j < numberOfAsterisks; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
