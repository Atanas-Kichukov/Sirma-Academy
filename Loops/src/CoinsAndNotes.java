import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins1lv = Integer.parseInt(scanner.nextLine());
        int coins2lv = Integer.parseInt(scanner.nextLine());
        int banknotes5lv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int lv1 = 0; lv1 <= coins1lv; lv1++) {
            for (int lv2 = 0; lv2 <= coins2lv; lv2++) {
                for (int lv5 = 0; lv5 <= banknotes5lv; lv5++) {
                    if ((lv1 * 1) + (lv2 * 2) + (lv5 * 5) == sum) {

                        System.out.printf("%d * 1 lv. + %d + 2 lv. + %d * 5 lv. = %d lv.%n", lv1, lv2, lv5, sum);

                    }
                }
            }
        }
    }
}
