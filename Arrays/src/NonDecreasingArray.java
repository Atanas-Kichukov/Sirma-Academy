import java.util.Arrays;
import java.util.Scanner;

public class NonDecreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int smallestNum = input[0];
        String output = smallestNum + " ";
        for (int i = 0; i < input.length; i++) {
            if(input[i]>smallestNum){
                if(i == input.length - 1){
                    output += input[i];
                }else {
                    output += input[i] + " ";
                    smallestNum = input[i];
                }
            }
        }

        System.out.println(output);




    }
}
