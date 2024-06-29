import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
        for (int i = 0; i < usernames.length; i++) {
            String username = usernames[i];
            Matcher matcher = pattern.matcher(username);

            if(matcher.find()){
                System.out.println(username);
            }
        }
    }
}
