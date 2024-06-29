import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int numberToPrint = 1;

        boolean allNumbersPrinted = false;
        for (int i = 1; i <= number; i++) {
            if (allNumbersPrinted) {
                break;
            }
            for (int j = 0; j < i; j++) {
                if (numberToPrint > number) {
                    allNumbersPrinted = true;
                    break;
                }
                System.out.print(numberToPrint + " ");
                numberToPrint++;
            }
            System.out.println();
        }

    }
}
