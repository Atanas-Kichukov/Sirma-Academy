import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String element= scanner.nextLine();
        List<String> asd = new ArrayList<>(Arrays.stream(input).toList());

        int i = asd.indexOf(element);
        int d = asd.lastIndexOf(element);

        System.out.println(i);
        System.out.println(d);

    }
}
