package TaskSheduler;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        PriorityQueue<Task> tasks = new PriorityQueue<>
                ((a,b)-> {
                    if(a.getPriority() == b.getPriority()){
                        return 0;
                    }else if(a.getPriority()>b.getPriority()){
                        return -1;
                    }else{
                        return 1;
                    }
                });

        while (!input.equals("End")){
            if(input[0].equals("getNextTask")){
                System.out.println(tasks.poll().toString());
            }else {
                Task task = new Task(input[1], Integer.parseInt(input[2]));
                tasks.add(task);
            }

            input= scanner.nextLine().split("\\s+");

        }
    }
}
