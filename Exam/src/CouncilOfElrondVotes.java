import java.util.Scanner;

public class CouncilOfElrondVotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] votes = scanner.nextLine().split(", ");
        int yesCount = 0;
        int noCount = 0;
        int abstainCount = 0;

        for (int i = 0; i < votes.length; i++) {
            String vote = votes[i];
            switch (vote) {
                case "Yes":
                    yesCount++;
                    break;
                case "No":
                    noCount++;
                    break;
                case "Abstain":
                    abstainCount++;
                    break;
            }
        }

        if(yesCount == 0 && noCount == 0 && abstainCount != 0 ) {
            System.out.println("Abstain");
        } else if (yesCount == noCount) {
            System.out.println("Tie");
        } else if (yesCount > noCount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
