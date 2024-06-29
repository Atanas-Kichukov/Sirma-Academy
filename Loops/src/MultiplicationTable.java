import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                int result = i * j;
                System.out.println( i + " * " + j + " = " + result);
            }
        }
    }
}
