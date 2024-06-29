import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int timesToRepeat = Integer.parseInt(scanner.nextLine());

        input = modifyString(input,timesToRepeat);

        System.out.println(input);
    }

    private static String modifyString(String input, int timesToRepeat) {
        String modifiedWord = "";
        for (int i = 0; i < timesToRepeat; i++) {
            modifiedWord += input;
        }
        return modifiedWord;
    }
}
