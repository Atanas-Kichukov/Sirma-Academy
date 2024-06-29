import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();
        double discount = 0.0;
        double pricePerNight = 0.0;
        double bill = 0.0;

        switch (typeOfRoom) {
            case "single room":
                pricePerNight = 25.0;
                bill = pricePerNight * (daysToStay - 1);
                if (assessment.equals("positive")) {
                    bill = bill + (bill * 0.25);
                } else {
                    bill = bill - (bill * 0.1);
                }
                break;
            case "apartment":
                pricePerNight = 50.0;
                bill = pricePerNight * (daysToStay - 1);
                if (daysToStay < 10) {
                    discount = 0.3;
                    bill = bill - (bill * discount);
                } else if (daysToStay <= 15){
                    discount = 0.35;
                    bill = bill - (bill * discount);
                }else {
                    discount = 0.5;
                    bill = bill - (bill * discount);
                }
                if(assessment.equals("positive")){
                    bill = bill + (bill * 0.25);
                }else {
                    bill = bill - (bill * 0.1);
                }
                    break;
            case "presidential":
                pricePerNight = 100.0;
                bill = pricePerNight * (daysToStay - 1);
                if (daysToStay < 10) {
                    discount = 0.1;
                    bill = bill - (bill * discount);
                } else if (daysToStay <= 15){
                    discount = 0.15;
                    bill = bill - (bill * discount);
                }else {
                    discount = 0.20;
                    bill = bill - (bill * discount);
                }
                if(assessment.equals("positive")){
                    bill = bill + (bill * 0.25);
                }else {
                    bill = bill - (bill * 0.1);
                }
                break;
        }

        System.out.printf("%.2f",bill);
    }
}
