import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> countRealNumbers = new LinkedHashMap<>();

        for (double number : input) {
            if(countRealNumbers.containsKey(number)){
                countRealNumbers.put(number,countRealNumbers.get(number) + 1);
            }
            countRealNumbers.putIfAbsent(number,1);
        }

        for (Map.Entry<Double, Integer> entry : countRealNumbers.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}