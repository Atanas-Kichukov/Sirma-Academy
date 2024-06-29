import java.util.*;
import java.util.stream.Collectors;

public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = 50;

       LinkedHashSet<Integer> cardsForFirstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> cardsForSecondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        ArrayDeque<Integer> firstPlayerDeck = new ArrayDeque<>(cardsForFirstPlayer);
        ArrayDeque<Integer> secondPlayerDeck = new ArrayDeque<>(cardsForSecondPlayer);


        while(round>0 && !firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()){
            int firstPlayerCard = firstPlayerDeck.pop();
            int secondPlayerCard = secondPlayerDeck.pop();

           if(firstPlayerCard>secondPlayerCard){
                firstPlayerDeck.offer(firstPlayerCard);
                firstPlayerDeck.offer(secondPlayerCard);
            }else{
                secondPlayerDeck.offer(secondPlayerCard);
                secondPlayerDeck.offer(firstPlayerCard);
            }
            round--;
        }
        if(firstPlayerDeck.size()>secondPlayerDeck.size()){
            System.out.println("First player wins!");
        }else if (firstPlayerDeck.size()<secondPlayerDeck.size()){
            System.out.println(("Second player wins!"));
        }else {
            System.out.println("Draw!");
        }
    }
}
