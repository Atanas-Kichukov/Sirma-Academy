import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = scanner.nextLine();

        int indexOfBackslash = location.lastIndexOf("\\");
        int indexOfLastDot = location.lastIndexOf(".");

        String fileName = location.substring(indexOfBackslash + 1,indexOfLastDot);
        String extension = location.substring(indexOfLastDot + 1);

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s",extension);
    }
}
