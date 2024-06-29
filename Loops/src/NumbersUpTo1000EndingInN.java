import java.util.Scanner;

public class NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastDigit = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 1000; i++) {
            if(i % 10 == lastDigit){
                System.out.println(i);
            }
        }
    }
}
