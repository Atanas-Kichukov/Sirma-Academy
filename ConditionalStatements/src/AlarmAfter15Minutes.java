import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int after15Min = minutes + 15;

        if (after15Min >= 60) {
            after15Min -= 60;
            hours++;
            if (hours == 24) {
                hours = 0;
            }
        }

        if (after15Min < 10) {
            System.out.print(hours + ":" + "0" + after15Min);
        } else {
            System.out.print(hours + ":" + after15Min);
        }
    }
}
