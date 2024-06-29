import java.util.Scanner;

public class PrintEveryNthElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int nthElement = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i++) {
            if(i % nthElement == 0){
                System.out.print(input[i] + " ");
            }
        }
    }
}
