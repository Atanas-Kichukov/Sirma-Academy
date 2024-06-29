import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] wordsToBan = scanner.nextLine().split(", ");
        String textToFilter = scanner.nextLine();

        for (int i = 0; i < wordsToBan.length; i++) {
            String word = wordsToBan[i];
            String asterisks = "";
            for (int j = 0; j < word.length(); j++) {
                asterisks += "*";
            }
            textToFilter = textToFilter.replaceAll(word,asterisks);

        }
        System.out.println(textToFilter);
    }
}
