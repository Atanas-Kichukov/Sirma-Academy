import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printer = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print")) {

            if(input.equals("cancel") && !printer.isEmpty()){
                String removedFile = printer.poll();
                System.out.println("Canceled " + removedFile);
            }else if(input.equals("cancel")){
                System.out.println("Standby");
            }else{
                printer.offer(input);
            }

            input = scanner.nextLine();
        }

        while (!printer.isEmpty()){
            System.out.println(printer.poll());
        }
    }
}
