import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i : input) {
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
