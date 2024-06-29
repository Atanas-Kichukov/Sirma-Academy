import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        for (String s : input) {
            String lowerCase = s.toLowerCase();
            if (words.containsKey(lowerCase)) {
                words.put(lowerCase, words.get(lowerCase) + 1);
            }

            words.putIfAbsent(lowerCase, 1);
        }
        List<String> oddOccurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0){
                oddOccurrences.add(entry.getKey());
            }
        }

        System.out.println(String.join(",", oddOccurrences));
    }
}
