import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        LinkedHashMap<Character,Integer> symbols = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {

            String word = input[i];
            for (int j = 0; j < word.length(); j++) {

                if(symbols.containsKey(word.charAt(j))){
                    symbols.put(word.charAt(j),symbols.get(word.charAt(j)) + 1);
                }

                symbols.putIfAbsent(word.charAt(j),1);
            }

        }
        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
