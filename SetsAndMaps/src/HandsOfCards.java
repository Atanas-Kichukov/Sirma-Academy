import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Set<String>> playerWithScore = new LinkedHashMap<>();


        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");
            String name = tokens[0];

            Set<String> cards = Arrays.stream(tokens[1].split(", "))
                    .collect(Collectors.toSet());

            if (playerWithScore.containsKey(name)) {
                playerWithScore.get(name).addAll(cards);
            } else {
                playerWithScore.put(name, cards);
            }


            input = scanner.nextLine();
        }


        for (Map.Entry<String, Set<String>> entry : playerWithScore.entrySet()) {
        int sum = calculatePoints(entry.getValue());
            System.out.printf("%s: %d%n",entry.getKey(),sum);

        }


    }

    private static Map<Character, Integer> getCards() {
        Map<Character, Integer> cardsWithPowers = new HashMap<>();
        cardsWithPowers.put('1', 1);
        cardsWithPowers.put('2', 2);
        cardsWithPowers.put('3', 3);
        cardsWithPowers.put('4', 4);
        cardsWithPowers.put('5', 5);
        cardsWithPowers.put('6', 6);
        cardsWithPowers.put('7', 7);
        cardsWithPowers.put('8', 8);
        cardsWithPowers.put('9', 9);
        cardsWithPowers.put('J', 11);
        cardsWithPowers.put('Q', 12);
        cardsWithPowers.put('K', 13);
        cardsWithPowers.put('A', 14);
        cardsWithPowers.put('S', 4);
        cardsWithPowers.put('H', 3);
        cardsWithPowers.put('D', 2);
        cardsWithPowers.put('C', 1);
        return cardsWithPowers;
    }

    public static int calculatePoints(Set<String> cards) {
        int sum = 0;
        Map<Character, Integer> cardsWithPowers = getCards();
        for (String card : cards) {
            if (card.length() == 3) {
                sum += 10 * cardsWithPowers.get(card.charAt(2));
            } else {
                Integer cardType = cardsWithPowers.get(card.charAt(0));
                Integer cardColor = cardsWithPowers.get(card.charAt(1));
                sum += cardType * cardColor;
            }
        }
        return sum;
    }
}
