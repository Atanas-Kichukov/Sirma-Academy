import java.util.Scanner;

public class PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstIngredient = scanner.nextLine();
        String secondIngredient = scanner.nextLine();

        switch (firstIngredient){
            case"herbs":
                if (secondIngredient.equals("oil")) {
                    System.out.println("Stealth potion");
                } else if (secondIngredient.equals("water")) {
                    System.out.println("Health potion");
                }else{
                    System.out.println("Minor stamina potion");
                }
                break;
            case"berries":
                if (secondIngredient.equals("sugar")) {
                    System.out.println("Speed potion");
                }else{
                    System.out.println("Minor energy potion");
                }
                break;
            default:
                System.out.println("Can't brew any potion");
                break;
        }
    }
}
