
import java.util.*;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> periodicTable = new TreeSet<>();

        int countOfElements = Integer.parseInt(scanner.nextLine());
        while(countOfElements>0){
            String[] elements = scanner.nextLine().split("\\s+");
            periodicTable.addAll(Arrays.asList(elements));


            countOfElements--;
        }

        System.out.println(String.join(" ", periodicTable));

    }
}
