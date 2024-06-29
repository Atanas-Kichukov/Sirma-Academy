import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int result = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if(i % 2 == 0){
                result += i;
                counter++;
            }
            if(counter == number){
                break;
            }
        }
        System.out.println(result);
    }
}
