package Factorio;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        List<Robot> robots = new ArrayList<>();
        ArrayDeque<String> productionLine = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String[] robotInformation = input[i].split("-");
            Robot robot = new Robot(robotInformation[0], Integer.parseInt(robotInformation[1]));
            robots.add(robot);
        }

        String[] time = scanner.nextLine().split(":");

        int hoursStartTime = Integer.parseInt(time[0]);
        int minutesStartTime = Integer.parseInt(time[1]);
        int secondsStartTime = Integer.parseInt(time[2]);

        String material = scanner.nextLine();
        while (!material.equals("End")) {
            secondsStartTime++;

            if (secondsStartTime >= 60) {
                minutesStartTime++;
                if (minutesStartTime >= 60) {
                    hoursStartTime++;
                    minutesStartTime -= 60;
                }
                secondsStartTime -= 60;
            }


            for (int i = 0; i < robots.size(); i++) {
                Robot robot = robots.get(i);
                if(robot.getMaterial().isEmpty()){
                    robot.setMaterial(material);
                    material = "";
                    break;
                }
            }

            for (int i = 0; i < robots.size(); i++) {
                Robot robot = robots.get(i);
                if(secondsStartTime % robot.getTime() == 0){
                    robot.setMaterial("");
                }
            }

            if(!material.isEmpty()){
                productionLine.offer(material);
            }
            material = scanner.nextLine();
        }
//TODO
    }
}
