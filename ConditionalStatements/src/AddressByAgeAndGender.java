import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age <= 0) {
            System.out.println("Zero or negative age");
            return;
        }

        if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
        else {
            if (age<16){
                System.out.println("Master");
            }else{
                System.out.println("Mr.");
            }
        }

    }
}
