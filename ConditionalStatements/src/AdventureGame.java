import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstItem = scanner.nextLine();
        String secondItem = scanner.nextLine();

        if (firstItem.equals("sword")) {
            if (secondItem.equals("shield")) {
                System.out.println("Path to the castle");
            } else {
                System.out.println("Path to the forest");
            }
        } else if (firstItem.equals("map")) {
            if (secondItem.equals("coins")) {
                System.out.println("Go to the town");
            } else {
                System.out.println("Camp");
            }
        } else {
            System.out.println("Wander aimlessly");
        }
    }
}
