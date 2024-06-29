import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int smallNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder sum = new StringBuilder();

        int remainder = 0;
        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int lastDigit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int product = lastDigit * smallNumber;
            int numberToAppend = 0;
            if (product > 9) {
                numberToAppend = product % 10;
                if (remainder != 0) {
                    numberToAppend += remainder;
                    remainder = 0;
                }
                remainder = product / 10;
            }else{
                numberToAppend = product;
            }


            sum.append(numberToAppend);
        }
        System.out.println(sum.reverse());

    }//TODO
}
