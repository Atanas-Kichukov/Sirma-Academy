import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        int extracurriculars = Integer.parseInt(scanner.nextLine());

        if(score>=90 || (score>=80 && extracurriculars>=2)){
            System.out.println("Admitted");
        }else{
            System.out.println("Not admitted");
        }
    }
}
