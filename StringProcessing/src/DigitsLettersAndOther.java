import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                numbers.append(input.charAt(i));
            }else if(Character.isLetter(input.charAt(i))){
                characters.append(input.charAt(i));
            }else{
                other.append(input.charAt(i));
            }
        }
        System.out.println(numbers);
        System.out.println(characters);
        System.out.println(other);

    }
}
