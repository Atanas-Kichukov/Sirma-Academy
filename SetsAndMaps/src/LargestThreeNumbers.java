import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        input.sort((v1,v2) -> v2.compareTo(v1));
        List<String> largestThree = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if(i == 3){
                break;
            }else{
               largestThree.add(String.valueOf(input.get(i)));
            }
        }


        System.out.println(String.join(" ",largestThree));
    }
}
