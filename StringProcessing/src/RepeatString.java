import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int countOfElements = 0; countOfElements < input.length; countOfElements++) {
            String word = input[countOfElements];
            for (int wordLength = 0; wordLength < word.length() ; wordLength++) {
                sb.append(word);
            }

        }
        System.out.println(sb);
    }
}
