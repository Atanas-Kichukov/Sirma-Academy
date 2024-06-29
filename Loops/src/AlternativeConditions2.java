import java.util.Scanner;

public class AlternativeConditions2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int currentNum = 1;
        int rows = 1;

        while (currentNum + rows <= n) {
            currentNum += rows;
            rows++;
        }
        currentNum = 1;


        for (int i = 1; i <= rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }


            for (int j = 0; j < i && currentNum <= n; j++) {
                System.out.print(currentNum + " ");
                currentNum++;
            }


            System.out.println();
        }
    }
}
