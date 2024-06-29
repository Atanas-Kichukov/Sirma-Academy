import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String, StringBuilder> pairOfWords = new LinkedHashMap<>();
        while (!input.equals("end")) {
            StringBuilder reversedWord = new StringBuilder();
            reversedWord.append(input).reverse();
            pairOfWords.put(input,reversedWord);
            input = scanner.nextLine();

        }
        for (Map.Entry<String, StringBuilder> entry : pairOfWords.entrySet()) {
            System.out.printf("%s = %s%n",entry.getKey(),entry.getValue());

        }
    }
}