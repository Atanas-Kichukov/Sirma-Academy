import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("It's a leap year");
            } else {
                System.out.println("It's not a leap year");
            }
        } else if (year % 4 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
