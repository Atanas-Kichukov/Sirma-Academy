import java.util.ArrayDeque;
import java.util.Scanner;

public class DocumentEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> insert = new ArrayDeque<>();
        ArrayDeque<String> redo = new ArrayDeque<>();

        while (!input.equals("End")) {
            String command = input.substring(0,input.indexOf('('));

            if (command.equals("Insert")) {
            insert.offer(input.substring
                    (input.indexOf("\"") + 1,
                    input.lastIndexOf("\"")));
                print(insert);
            }

            else if(command.equals("Undo")){
            redo.offer(insert.pollLast());
                print(insert);

            }
            else{
            insert.offerLast(redo.pollLast());
                print(insert);
            }

          input = scanner.nextLine();
        }

        print(insert);
    }

    private static void print(ArrayDeque<String> insert) {
        int size = insert.size();
        for (int i = 0; i < size; i++) {
            String polled = insert.poll();
            System.out.print(polled);
            insert.offer(polled);
        }
        System.out.println();


    }
}
