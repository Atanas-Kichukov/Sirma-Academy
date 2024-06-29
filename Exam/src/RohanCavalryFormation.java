import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RohanCavalryFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cavalry = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> modifiedCavalry;
        String input = scanner.nextLine();

        int index = 0;
        String id = "";

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {

                case "destroy":
                    index = Integer.parseInt(tokens[1]);

                    if (isValid(index, cavalry)) {
                        cavalry.remove(index);
                        printCavalry(cavalry);

                    }

                    break;

                case "swap":

                    index = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    modifiedCavalry = new ArrayList<>(cavalry);

                    if (isValid(index, cavalry) && isValid(secondIndex, cavalry)) {
                        String firstElement = cavalry.get(index);
                        String secondElement = cavalry.get(secondIndex);
                        cavalry.set(secondIndex, firstElement);
                        cavalry.set(index, secondElement);
                        if (!cavalry.equals(modifiedCavalry)) {
                            printCavalry(cavalry);
                        }
                    }

                    break;

                case "add":

                    id = tokens[1];
                    cavalry.add(String.valueOf(id));
                    printCavalry(cavalry);

                    break;

                case "insert":

                    index = Integer.parseInt(tokens[2]);
                    id = tokens[1];

                    if (isValid(index, cavalry)) {
                        cavalry.set(index, id);
                        printCavalry(cavalry);
                    }else if(index > cavalry.size() - 1){
                        cavalry.add(id);
                        printCavalry(cavalry);
                    }

                    break;

                case "center":
                    int middleElementIndex = cavalry.size() / 2;
                    String firstMiddleElement;


                    if (cavalry.size() % 2 == 0) {
                        firstMiddleElement = cavalry.get(middleElementIndex - 1);
                        String secondMiddleElement = cavalry.get(middleElementIndex);
                        System.out.println(firstMiddleElement + " " + secondMiddleElement);
                    } else {
                        firstMiddleElement = cavalry.get(middleElementIndex);
                        System.out.println(firstMiddleElement);
                    }
                    break;


            }
            input = scanner.nextLine();
        }

    }

    public static boolean isValid(int index, List<String> cavalry) {
        if (index < 0 || index > cavalry.size() - 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void printCavalry(List<String> cavalry) {
        System.out.println(String.join(" ", cavalry));
    }
}
