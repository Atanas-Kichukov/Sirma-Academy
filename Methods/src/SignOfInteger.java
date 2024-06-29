import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = Integer.parseInt(scanner.nextLine());
        signOfNumber(numberToCheck);

    }
    public static void signOfNumber(int number){
        if(number<0){
            System.out.printf("The number %d is negative.",number);
        }else if(number>0){
            System.out.printf("The number %d is positive.",number);
        }else{
            System.out.printf("The number %d is zero.",number);
        }
    }
}