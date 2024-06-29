import java.util.Scanner;

public class ExcelColumnNameToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String columName = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < columName.length(); i++) {
            result *= 26;
            result += columName.charAt(i) -'A' + 1;
        }
        System.out.println(result);

    }
}
