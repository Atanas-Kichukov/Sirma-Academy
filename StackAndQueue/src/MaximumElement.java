import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> maximumElement = new ArrayDeque<>();


        int countOfCommands = Integer.parseInt(scanner.nextLine());
        int biggestNum = Integer.MIN_VALUE;
        String input = scanner.nextLine();


        while (countOfCommands != 0) {
            String[] command = input.split("\\s+");
            switch (command[0]) {

                case "1":
                    maximumElement.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    maximumElement.pop();
                    break;
                case "3":
                    for (int i = 0; i < maximumElement.size(); i++) {
                        int numberToCompare = maximumElement.pop();
                        if(numberToCompare>biggestNum){
                            biggestNum = numberToCompare;
                        }
                        maximumElement.offer(numberToCompare);

                    }
                    System.out.println(biggestNum);
                    biggestNum = Integer.MIN_VALUE;
                    break;
            }

            input = scanner.nextLine();
            countOfCommands--;
        }
    }
}
