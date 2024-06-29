import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] firstArray = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] == secondArray[i]){
                sum += firstArray[i];
            }else{
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                return;
            }
        }
        System.out.println("Arrays are identical. Sum:" + sum);
    }
}
