import java.util.LinkedHashSet;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guestNumber = scanner.nextLine();

        LinkedHashSet<String> vipList = new LinkedHashSet<>();
        LinkedHashSet<String> regularList = new LinkedHashSet<>();

        while (!guestNumber.equals("PARTY")) {

            if (Character.isDigit(guestNumber.charAt(0))) {
                vipList.add(guestNumber);
            } else {
                regularList.add(guestNumber);
            }

            guestNumber = scanner.nextLine();
        }

        String arrivedGuest = scanner.nextLine();
        ;
        while (!arrivedGuest.equals("END")) {

            if (Character.isDigit(arrivedGuest.charAt(0))) {
                vipList.remove(arrivedGuest);
            } else {
                regularList.remove(arrivedGuest);
            }


            arrivedGuest = scanner.nextLine();
        }

        int guestWhichDidntArrived = vipList.size() + regularList.size();
        System.out.println(guestWhichDidntArrived);

        for (String vip : vipList) {
            System.out.println(vip);
        }
        for (String regular : regularList) {
            System.out.println(regular);
        }
    }
}
