import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                for (int k = 1; k <= number; k++) {
                    for (int l = 1; l <= number; l++) {
                        if(number % i == 0 &&
                        number % j == 0 &&
                        number % k == 0 &&
                        number % l == 0){
                            System.out.println("" + i + j + k + l);
                        }
                    }
                }
            }

        }
    }
}
