import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 13) {
            System.out.println("U-rated movies");
        } else if (age <= 17){
            System.out.println("U and PG-13 rated movies");
        }else {
            System.out.println("All movies");
        }
    }
}
