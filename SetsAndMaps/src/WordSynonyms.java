import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> wordsWithSynonyms = new LinkedHashMap<>();
        int wordsCount = Integer.parseInt(scanner.nextLine());

        while (wordsCount>0){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if(wordsWithSynonyms.containsKey(word)){
                wordsWithSynonyms.get(word).add(synonym);
            }
            else {
                wordsWithSynonyms.put(word, new ArrayList<>());
                wordsWithSynonyms.get(word).add(synonym);
            }

            wordsCount--;
        }

        for (Map.Entry<String, List<String>> entry : wordsWithSynonyms.entrySet()) {
            String word = entry.getKey();

            String synonyms = String.join(",",entry.getValue());
            System.out.printf("%s - %s%n",word,synonyms);

        }
    }
}
