import java.util.Scanner;

public class FaceOfFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area =0.0 ;
        double side;
        switch (figure){
            case "square":
                 side = Double.parseDouble(scanner.nextLine());
                area = side * side;
                break;
            case "rectangle":
                double sideA = Double.parseDouble(scanner.nextLine());
                double sideB = Double.parseDouble(scanner.nextLine());
                area = sideA * sideB;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * Math.pow(radius,2);
                break;
            case "triangle":
                double altitude = Double.parseDouble(scanner.nextLine());
                side = Double.parseDouble(scanner.nextLine());
                area = (altitude * side) / 2 ;
                break;
        }
        System.out.printf("%.2f",area);
    }
}
