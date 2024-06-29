import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int rotations = Integer.parseInt(scanner.nextLine());
        //1 2 3 4
        //4 1 2 3
        //3 4 1 2
        String temp = "";
        for (int i = 0; i < rotations; i++) {

            for (int j = input.length - 1; j > 0; j--) {
                temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
            }
        }

        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
