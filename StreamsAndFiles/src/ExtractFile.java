import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExtractFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Projects\\Sirma-Academy\\Java\\StreamsAndFiles\\input.txt";
        Path filePath = Paths.get(path);
        File file = new File(path);
        String nameWithExtension= file.getName();

        String fileName = "";
        String fileExtension = "";

        int lastDot = nameWithExtension.lastIndexOf(".");
        fileName = nameWithExtension.substring(0,lastDot);
        fileExtension = nameWithExtension.substring(lastDot);
        byte[] bytes = Files.readAllBytes(filePath);
        long allBytes = 0;
        for (byte b :bytes){
            allBytes+=b;
        }

        System.out.println("File name: " + fileExtension);
        System.out.println("File extension: " + fileName);
        System.out.println("File size: " + allBytes);

    }
}
