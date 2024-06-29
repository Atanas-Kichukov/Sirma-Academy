import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                getMax(a,b);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                getMax(firstChar,secondChar);
                break;
            case "string":
                String firstWord = scanner.nextLine();
                String secondWord = scanner.nextLine();
                getMax(firstWord,secondWord);
                break;

        }

    }

    private static void getMax(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    private static void getMax(char firstChar, char secondChar) {
        if (firstChar>secondChar){
            System.out.println(firstChar);
        }else {
            System.out.println(secondChar);
        }
    }
    private static void getMax(String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord)>0){
            System.out.println(firstWord);
        }else {
            System.out.println(secondWord);
        }
    }
}
