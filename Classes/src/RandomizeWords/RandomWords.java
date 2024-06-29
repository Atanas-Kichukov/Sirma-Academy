package RandomizeWords;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s++")).collect(Collectors.toList());

        Random random = new Random();
        for (int i = 0; i < input.size(); i++) {
            int index = random.nextInt(input.size());
            System.out.println(input.get(index));
        }
    }
}
