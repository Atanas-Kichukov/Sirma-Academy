import java.util.ArrayDeque;
import java.util.Scanner;

public class LegendaryDuels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> attacks = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ('(') || input.charAt(i) == ('{')) {
                attacks.push(input.charAt(i));
            } else if (input.charAt(i) == ('!')) {
                if (!attacks.isEmpty() && attacks.peek() == '!') {
                    attacks.pop();
                } else {
                    attacks.push(input.charAt(i));
                }
            } else {
                char stackElement = attacks.pop();
                switch (input.charAt(i)) {
                    case '}':
                        if (stackElement != '{') {
                            System.out.println("Not Legendary");
                            return;
                        }
                        break;
                    case ')':
                        if (stackElement != '(') {
                            System.out.println("Not Legendary");
                            return;
                        }
                        break;
                }
            }
        }
        if (attacks.isEmpty()) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not legendary");
        }
    }

}