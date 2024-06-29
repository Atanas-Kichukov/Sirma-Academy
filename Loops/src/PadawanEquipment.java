import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts = studentCount / 6;
        double allLightSabersNeeded = Math.ceil(studentCount + (studentCount * 0.1));
        double diff = 0;


        double neededMoney = allLightSabersNeeded * lightSaberPrice +
                studentCount * robePrice +
                (studentCount - freeBelts) * beltPrice;
        if(neededMoney <= money){
             diff = money - neededMoney;
            System.out.printf("The money is enough = it would cost %.2flv.",diff);
        }
        else{
             diff = neededMoney - money;
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }


    }
}
