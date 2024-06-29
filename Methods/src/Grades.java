import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());


        grading(grade);
    }
    public static void grading(double grade){
        if(grade<=2.99){
            System.out.println("Fail");
        }else if(grade<=3.49){
            System.out.println("Poor");
        }else if(grade<=4.49){
            System.out.println("Good");
        }else if(grade<=5.49){
            System.out.println("Very Good");
        }else if(grade<=6.00){
            System.out.println("Excellent");
        }
    }
}
