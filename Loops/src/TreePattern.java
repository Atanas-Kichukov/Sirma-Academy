import java.util.Scanner;

public class TreePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfTree = Integer.parseInt(scanner.nextLine());
        int countOfWhiteSpaces = 0;
        int bonusAsterisks = 0;

        for (int row = 0; row < heightOfTree; row++) {

            countOfWhiteSpaces = heightOfTree - row;

            for (int spaces = 0; spaces < countOfWhiteSpaces - 1 ; spaces++) {
                System.out.print(" ");
            }

            for (int asterisks = 0; asterisks <= row + bonusAsterisks; asterisks++) {
                System.out.print("*");
            }
            bonusAsterisks++;
            System.out.println();

            if(row  == heightOfTree - 1){
                for (int log = 0; log < heightOfTree; log++) {
                  if(log != heightOfTree - 1){
                      System.out.print(" ");
                  }else {
                      System.out.print("*");
                  }
                }
            }
        }
    }
}
