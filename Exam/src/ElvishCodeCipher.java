import java.util.Scanner;

public class ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String messageToDecrypt = scanner.nextLine();
        int placesBefore = Integer.parseInt(scanner.nextLine());
        StringBuilder decryptedWord = new StringBuilder();

        for (int i = 0; i < messageToDecrypt.length(); i++) {
            char letter = messageToDecrypt.charAt(i);
            char decryptedLetter = (char) (letter - placesBefore);
            decryptedWord.append(decryptedLetter);
        }

        System.out.println(decryptedWord);
    }
}
