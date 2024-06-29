import java.io.*;


public class ReplaceWord {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while((line = reader.readLine()) != null){
                String [] tokens = line.split("\\s+");
                for (int i = 0; i < tokens.length; i++) {
                    String wordToWrite =  tokens[i];
                    if(wordToWrite.equals("Java")){
                        wordToWrite = "HTML";
                    }
                 writer.write(wordToWrite + " ");
                }
                writer.write(System.lineSeparator());
            }


        }


    }


}
