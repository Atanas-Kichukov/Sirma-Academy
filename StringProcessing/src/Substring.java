import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pieceToRemove = scanner.nextLine();
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);

        int indexToRemove = sb.indexOf(pieceToRemove);
        while (indexToRemove>0){
            sb.delete(indexToRemove, indexToRemove + pieceToRemove.length());


            indexToRemove = sb.indexOf(pieceToRemove);
        }
        System.out.println(sb);
    }
}
