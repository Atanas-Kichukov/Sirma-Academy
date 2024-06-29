import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) throws IOException {
        try (BufferedReader readerForFirstFile = new BufferedReader(new FileReader("input1.txt"));
             BufferedReader readerForSecondFile = new BufferedReader(new FileReader("input2.txt"));
             // We need two PrintWriter objects: One to write in the file
             // the other to print on the console. One cannot do both jobs.
             PrintWriter writer = new PrintWriter("output.txt");
             PrintWriter printer = new PrintWriter(System.out,true)) {


            long countOfLines = Files.lines(Paths.get("input1.txt")).count();
            for (int i = 0; i < countOfLines * 2; i++) {
                String line;
                if (i % 2 == 0) {
                    line = readerForFirstFile.readLine();
                } else {
                    line = readerForSecondFile.readLine();
                }
                writer.println(line);
                printer.println(line);
            }

        }
    }
}

