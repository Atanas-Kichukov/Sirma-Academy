import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = calculateArea(width,length);
        System.out.println(area);

    }

    private static int calculateArea(int width, int length) {

        return  width * length;
    }
}
