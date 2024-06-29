import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String[] command = scanner.nextLine().split(",");
        int index;
        for (int i = 0; i < command.length; i++) {
            //Add 3, Remove 2, RemoveAt 1, Insert 8 3
            String[] splitCommand = command[i].trim().split("\\s+");
            String[] modifiedArr;
            switch (splitCommand[0]) {
                case "Add":
                    input = Arrays.copyOf(input, input.length + 1);
                    input[input.length - 1] = splitCommand[1];
                    break;
                case "Remove":
                    modifiedArr = new String[input.length - 1];
                    for (int j = 0, k = 0; j < input.length; j++) {
                        if (!input[j].equals(splitCommand[1])) {
                            modifiedArr[k] = input[j];
                            k++;
                        }
                    }
                    input = modifiedArr;

                    break;
                case "RemoveAt":
                    modifiedArr = new String[input.length - 1];
                    index = Integer.parseInt(splitCommand[1]);
                    for (int j = 0, k = 0; j < input.length; j++) {
                        if (j != index) {
                            modifiedArr[k] = input[j];
                            k++;
                        }
                    }
                    input = modifiedArr;
                    break;
                case "Insert":

                    index = Integer.parseInt(splitCommand[2]);
                    modifiedArr = new String[input.length + 1];
                    for (int j = 0, k = 0; j < modifiedArr.length; j++) {

                        if (j == index) {
                            modifiedArr[j] = splitCommand[1];

                        } else {
                            modifiedArr[j] = input[k];
                            k++;
                        }


                    }
                    input = modifiedArr;
                    break;

            }

        }

        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
