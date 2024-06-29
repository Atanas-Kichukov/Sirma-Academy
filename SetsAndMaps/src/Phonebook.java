import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {

            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];

            if (phonebook.containsKey(name)) {
                phonebook.put(name, phoneNumber);
            }

            phonebook.putIfAbsent(name, phoneNumber);


            input = scanner.nextLine();
        }
            input = scanner.nextLine();
        while (!input.equals("stop")) {
            if (!phonebook.containsKey(input)) {
                System.out.printf("Contact %s not found.%n", input);
            } else {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            }

            input = scanner.nextLine();
        }
    }
}
