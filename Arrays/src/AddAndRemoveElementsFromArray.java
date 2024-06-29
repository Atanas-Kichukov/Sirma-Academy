import java.util.Arrays;
import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(",");
        int numToAdd = 0;
        int[] output = new int[0];
        for (String command : commands) {
            numToAdd++;
            if(command.equals("add")){
                output = Arrays.copyOf(output, output.length +1);
                output[output.length-1] = numToAdd;
            }else{
                if(output.length == 0){
                    output = Arrays.copyOf(output,0);
                }else {
                    output = Arrays.copyOf(output, output.length - 1);
                }
            }
        }

        if(output.length == 0){
            System.out.println("Empty");
        }else {
            System.out.println(Arrays.toString(output));
        }

    }
}
