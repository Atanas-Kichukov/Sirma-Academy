import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());

        topHalf(end);
        bottomHalf(end);

    }

    private static void bottomHalf(int end) {
        for (int i = end - 1; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void topHalf(int end) {
        for (int i = 1; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
