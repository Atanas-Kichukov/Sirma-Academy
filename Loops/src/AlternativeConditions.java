import java.util.Scanner;

public class AlternativeConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        int rows = 1;
        int numsPrinted = 0;
        int numsOnRow = 0;
        while (currentNum + rows <= n) {
            currentNum += rows;
            rows++;
        }
        currentNum = 1;

        for (int i = 1; i <= rows; i++) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            if(rows == i && i - (n - numsPrinted) !=0){
                for (int space = 0; space < i - (n - numsPrinted); space++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i && currentNum <= n; j++) {
                System.out.print(currentNum);
                numsPrinted++;
                currentNum++;
            }
            System.out.println();
        }
    }
}
