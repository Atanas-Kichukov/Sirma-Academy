import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrthancArchivesSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> records = Arrays
                .stream(scanner.nextLine().split(", "))
                .toList();
        String name = scanner.nextLine();

        int firstOccurrence = records.indexOf(name);
        int lastOccurrence = records.lastIndexOf(name);
        if (firstOccurrence < 0 || lastOccurrence < 0) {
            System.out.println("Record not found");
        } else {
            System.out.printf("First Occurrence: %d%n", firstOccurrence);
            System.out.printf("Last Occurrence: %d%n", lastOccurrence);
        }
    }
}
