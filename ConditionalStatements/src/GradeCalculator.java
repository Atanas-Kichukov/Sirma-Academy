import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percent = Integer.parseInt(scanner.nextLine());
        if (percent <= 59) {
            System.out.println("F");
        } else if (percent <= 69) {
            System.out.println("D");
        } else if (percent <= 79) {
            System.out.println("C");
        } else if (percent <= 89) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
