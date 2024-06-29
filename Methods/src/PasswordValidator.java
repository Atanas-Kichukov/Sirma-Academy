import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        String password = scanner.nextLine();

        isPasswordValid(password);

    }

    private static void isPasswordValid(String password) {
        int count = 0;
        int digits = 0;
        if(password.length()<6||password.length()>10){
            System.out.println("Password must be between 6 and 10 characters.");
            count++;
        }
        if(!password.matches("^[a-zA-z0-9]+$")){
            System.out.println("Password must contain only letters and digits.");
            count++;
        }

        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                digits++;
            }
        }
        if(digits <2){
            System.out.println("Password must have at least 2 digits");
            count++;
        }

        if(count == 0){
            System.out.println("Password is valid.");
        }
    }
}
