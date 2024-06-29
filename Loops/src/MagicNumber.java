import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        String result = "";
        int counter = 0;
        boolean isMagicNumber = false;
        for (int i = start; i <= end; i++) {

            if (isMagicNumber) {
                break;
            }
            for (int j = start; j <= end; j++) {
                counter++;
                sum = i + j;
                if (sum == magicNumber) {
                    result = "Combination " + i + " + " + j + " = " + magicNumber;
                    isMagicNumber = true;

                    break;
                }
            }
        }
        if (!isMagicNumber) {
            result = counter + " - neither equals " + magicNumber;
            System.out.println(result);
        } else {
            System.out.println(result);
        }

    }
}
