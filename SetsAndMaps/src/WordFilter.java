import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");


        for (String s : input) {
            if(s.length() % 2 == 0){
                System.out.println(s);
            }
        }
    }
}
