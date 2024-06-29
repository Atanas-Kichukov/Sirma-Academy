import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String environment = scanner.nextLine();
        String item = scanner.nextLine();
        switch (day){
            case"day":
                if (environment.equals("forest")) {
                    if (item.equals("knife")) {
                        System.out.println("Hunt for food");
                    } else if (item.equals("container")) {
                        System.out.println("Collect berries");
                    }else{
                        System.out.println("Explore");
                    }
                } else if (environment.equals("desert")) {
                    if (item.equals("hat")) {
                        System.out.println("Search for water");
                    }else {
                        System.out.println("Find shade");
                    }
                }
                break;
            case"night":
                if (environment.equals("forest")) {
                    if (item.equals("firestarter")) {
                        System.out.println("Make a campfire");
                    }else{
                        System.out.println("Climb a tree");
                    }
                } else if (environment.equals("desert")) {
                    if (item.equals("blanket")) {
                        System.out.println("Sleep");
                    }else{
                        System.out.println("Keep moving to stay warm");
                    }
                }
                break;
        }
    }
}
