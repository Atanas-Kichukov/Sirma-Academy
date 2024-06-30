package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box box = null;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            ;


            if (input.matches("\\d+")) {
                if (box == null) {
                    box = new Box<Integer>();
                }
                box.add(Integer.parseInt(input)); // Integer
            } else if (input.matches("\\d+\\.\\d+")) {
                if (box == null) {
                    box = new Box<Double>();
                }
                box.add(Double.parseDouble(input)); // Double
            } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                if (box == null) {
                    box = new Box<Boolean>();
                }
                box.add(Boolean.parseBoolean(input)); // Boolean
            } else {
                if (box == null) {
                    box = new Box<String>();
                }
                box.add(input); // String
            }


        }
        if (box != null) {
            System.out.println("Enter two valid indexes to swap elements");
            int first = Integer.parseInt(scanner.nextLine()) - 1;
            int second = Integer.parseInt(scanner.nextLine()) - 1;
            box.swap(first,second);
            System.out.println("Enter element to compare to");
            String elementToCompareTo = scanner.nextLine();
            int countOfGreaterElements = box.getCountOfGreaterElements(elementToCompareTo);
            System.out.println(countOfGreaterElements);
            System.out.println(box.toString());
        }
    }
}
