import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> children = new ArrayDeque<>();
        int tosses = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        for (int i = 0; i < input.length; i++) {
            children.offer(input[i]);
        }
      while(children.size() != 1){

          for (int i = 0; i < tosses; i++) {
              if(counter == tosses){
                  String removedChild = children.pop();
                  System.out.println("Remove " + removedChild);
              }else{
                  String child = children.pop();
                  children.offer(child);
              }
              counter++;
          }

          counter = 1;
      }

        System.out.println("Last is " + children.peek());

    }
}
