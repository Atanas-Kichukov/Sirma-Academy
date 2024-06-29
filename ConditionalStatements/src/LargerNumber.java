import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else if (firstNum < secondNum) {
            System.out.println(secondNum);
        }else {
            System.out.println("The numbers are equal!");
        }


    }
}
