import java.io.*;

public class ReverseLines {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder(line);
                reversedLine.reverse();
                writer.write(String.valueOf(reversedLine));
                writer.write(System.lineSeparator());
            }


        }


    }
}

