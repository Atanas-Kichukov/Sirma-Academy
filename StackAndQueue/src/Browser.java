import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                browserHistory.pop();
            }
            else{
                browserHistory.push(input);
            }
            System.out.println(browserHistory.peek());
            input = scanner.nextLine();
        }


    }
}
