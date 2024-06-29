import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if(row ==1 || row == rows) {
                    System.out.print("*");
                }else if(col == 1 || col == cols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
