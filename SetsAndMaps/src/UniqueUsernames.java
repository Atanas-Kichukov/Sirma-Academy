import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        int countOfWords = Integer.parseInt(scanner.nextLine());
        while (countOfWords>0){
            String name = scanner.nextLine();

            uniqueNames.add(name);

            countOfWords--;
        }
        for (String uniqueName : uniqueNames) {
            System.out.println(uniqueName);
        }
    }
}
