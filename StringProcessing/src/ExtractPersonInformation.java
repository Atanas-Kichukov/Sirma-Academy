import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfLines = Integer.parseInt(scanner.nextLine());

        while (countOfLines>0){
            String personInformation = scanner.nextLine();
            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)\\|.*#(?<age>[0-9]+)\\*");
            Matcher matcher = pattern.matcher(personInformation);
            matcher.find();
            String name = matcher.group("name");
            String age = matcher.group("age");
            System.out.printf("%s is %s years old.%n",name,age);
            countOfLines--;
        }


    }
}
