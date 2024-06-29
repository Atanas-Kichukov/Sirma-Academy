import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfFrame = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < sizeOfFrame; row++) {
            for (int col = 0; col < sizeOfFrame; col++) {
                if(((row == 0 && col == 0) || (row == 0 && col == sizeOfFrame -1)) ||
                        (row == sizeOfFrame -1 && col == 0) || (row == sizeOfFrame - 1 && col == sizeOfFrame -1)){
                    System.out.print("+");
                }else if(col == 0 || col == sizeOfFrame - 1){
                    System.out.print("|");
                }
                else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
            
        }
    }
}
