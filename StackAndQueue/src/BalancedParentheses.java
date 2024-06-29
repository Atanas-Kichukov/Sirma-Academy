import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> parentheses = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ('(')
                    || input.charAt(i) == ('{')
                    || input.charAt(i) == ('[')) {
                parentheses.push(input.charAt(i));

            }
            else {
                char stackElement = parentheses.pop();

                switch (input.charAt(i)) {
                    case '}':

                        if(stackElement == '(' || stackElement == '[' ){
                            System.out.println("False");
                            return;
                        }

                        break;
                    case ')':

                        if(stackElement == '{' || stackElement == '[' ){
                            System.out.println("False");
                            return;
                        }

                        break;
                    case ']':

                        if(stackElement == '(' || stackElement == '{' ){
                            System.out.println("False");
                            return;

                        }
                        break;
                }
            }
        }
        System.out.println("True");
    }

}

