import java.util.Scanner;

public class Numbers1ToNThroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());
        int incrementation = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= end; i+=incrementation) {
            System.out.println(i);

        }
    }
}
