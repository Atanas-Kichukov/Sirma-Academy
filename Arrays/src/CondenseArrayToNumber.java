import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[input.length - 1];;

        while(input.length>1){
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = input[i] + input[i + 1];
            }

            input = condensed;
            condensed = new int[condensed.length - 1];

        }
        System.out.println(input[0]);
    }
}



//5 0 4 1 2
// i = i + (i + 1)
//-----------------
// 5 4 5 3
// 9 9 8
// 18 17
// 35