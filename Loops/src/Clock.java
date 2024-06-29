import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int hours = 0; hours <= 23; hours++) {

            for (int minutes = 0; minutes < 60; minutes++) {
                if (hours < 10) {
                    if (minutes < 10) {
                        System.out.println("0" + hours + ":0" + minutes);
                    } else {
                        System.out.println(hours + ":" + minutes);
                    }
                } else {
                    if (minutes < 10) {
                        System.out.println(hours + ":0" + minutes);
                    } else {
                        System.out.println(hours + ":" + minutes);
                    }
                }
            }

        }
    }
}
