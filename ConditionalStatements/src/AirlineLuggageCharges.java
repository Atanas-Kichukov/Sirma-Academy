import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int dimension = Integer.parseInt(scanner.nextLine());
        int fee = 0;
        int count = 0;

        if (weight > 50) {
            fee += 100;
            count++;
        }

        if (dimension > 158) {
            int diff = dimension - 158;
            if (diff <= 20) {
                fee += 50;
            } else if (diff <= 50) {
                fee += 100;
            } else {
                fee += 200;
            }
        }

        if(count ==1){
            fee += 50;
        }
        System.out.printf("$%d",fee);
    }
}
