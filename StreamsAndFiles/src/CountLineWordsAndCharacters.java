import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLineWordsAndCharacters {
    public static void main(String[] args) throws IOException {
        int lineCount = 0;
        int wordsCount = 0;
        int charactersCount = 0;
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            while ((line = reader.readLine()) != null){
                lineCount++;
                String[]tokens = line.split("\\s+");
                wordsCount += tokens.length;
                for (int i = 0; i < tokens.length; i++) {
                    charactersCount += tokens[i].length();
                }


            }
        }
        System.out.println(lineCount);
        System.out.println(wordsCount);
        System.out.println(charactersCount);

    }
}
