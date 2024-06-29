import java.util.Scanner;

public class HalfRhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfAsterisks = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfAsterisks; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = numberOfAsterisks - 1; i >0 ; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
