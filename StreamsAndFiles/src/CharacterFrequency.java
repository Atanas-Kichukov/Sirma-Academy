import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");

        Map<Character,Integer> frequency = new LinkedHashMap<>();
        int data;
        while ((data = fileReader.read()) != -1){
            char element = (char) data;
            if(frequency.containsKey(element)){
                frequency.put(element,frequency.get(element) + 1);
            }
            frequency.putIfAbsent(element,1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }
    }
}
