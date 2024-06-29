import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if(age<=12){
            System.out.println("$5");
        }else if(age <= 19){
            System.out.println("$8");
        }else {
            System.out.println("$10");
        }
    }
}
