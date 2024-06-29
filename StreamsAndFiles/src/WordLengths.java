import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLengths {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Projects\\Sirma-Academy\\Java\\StreamsAndFiles\\input.txt";
        List<String> lengths = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line = in.readLine();
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
              lengths.add(String.valueOf(token.length()));
            }
            System.out.println(String.join(",",lengths));

        }
    }
}
