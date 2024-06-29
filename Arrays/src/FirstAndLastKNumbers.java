import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToPrint = Integer.parseInt(scanner.nextLine());
        String [] input = scanner.nextLine().split("\\s+");


        for (int i = 0; i <numbersToPrint ; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

        for (int i = input.length - numbersToPrint ; i < input.length  ; i++) {
            System.out.print(input[i] +" ");
        }

    }
}
// 3
// 1 2 3 4 5 6 7 8 9 10 = 10 length
// 1 2 3
// 8 9 10