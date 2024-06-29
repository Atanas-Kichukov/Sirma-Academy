import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueWords {
    public static void main(String[] args) throws IOException {
        Set<String> uniqueWords = new HashSet<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String[] split = reader.readLine().split("\\s+");

            for (String s : split) {
                if(s.contains(".")){
                    s = s.substring(0,s.indexOf("."));
                }
                uniqueWords.add(s.toLowerCase());
            }
        }
        System.out.println("Unique words: " + uniqueWords.size());
    }
}
