import java.util.Scanner;

public class CeasarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToEncrypt = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < wordToEncrypt.length(); i++) {
            char symbol = (char) (wordToEncrypt.charAt(i) + 3);

            encrypted.append(symbol);



        }

        System.out.println(encrypted);

    }
}
