import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String membership = scanner.nextLine();
        int discount =0;
        if (age < 18) {
            discount = 10;
        }else if(age <=64){
            discount = 10;
            if(membership.equals("Yes")){
                discount = 20;
            }
        }
        else {
            discount = 30;
        }
        System.out.printf("%d%% discount",discount);
    }
}
