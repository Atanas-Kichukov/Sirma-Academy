import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        TreeMap<Character,Integer> symbols = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {

            if(symbols.containsKey(word.charAt(i))){
                symbols.put(word.charAt(i),symbols.get(word.charAt(i)) + 1);
            }

            symbols.putIfAbsent(word.charAt(i),1);
        }

        symbols.forEach((k,v) -> System.out.printf("%s: %d%n",k,v));
    }

}
