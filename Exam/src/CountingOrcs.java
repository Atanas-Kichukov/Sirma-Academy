import java.util.Scanner;

public class CountingOrcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int killedOrcsPerHour = Integer.parseInt(scanner.nextLine());
        int bonusOrcsPerHour = Integer.parseInt(scanner.nextLine());
        int hoursOfFighting = Integer.parseInt(scanner.nextLine());
        int allKilledOrcs = 0;

        for (int i = 0; i < hoursOfFighting; i++) {

            if (killedOrcsPerHour >= 0) {

                allKilledOrcs += killedOrcsPerHour;
                killedOrcsPerHour = killedOrcsPerHour + bonusOrcsPerHour;

            } else {
                killedOrcsPerHour += bonusOrcsPerHour;
            }


        }
        if (killedOrcsPerHour < 0) {
            System.out.println(0);
        } else {
            System.out.println(allKilledOrcs);
        }
    }
}
