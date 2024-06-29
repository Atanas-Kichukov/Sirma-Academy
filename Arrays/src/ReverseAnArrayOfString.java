import java.util.Scanner;

public class ReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(",");
        String temp = "";
        for (int i = 0; i < arr.length / 2; i++) {
           temp = arr[i];
           arr[i] = arr[arr.length - i - 1];
           arr[arr.length - i - 1] = temp;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
