import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        for (int row = rows; row > 0; row--) {
            for (int col = 0; col < cols; col++) {
                if (row == rows) {
                    System.out.print("L" + row + col + " ");
                } else if (row % 2 == 0) {
                    System.out.print("O" + row + col + " ");
                } else {
                    System.out.print("A" + row + col + " ");
                }
            }
            System.out.println();
        }


    }
}
