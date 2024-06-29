package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] information = scanner.nextLine().split("\\s+");
        int countOfLines = Integer.parseInt(scanner.nextLine());
        Article article = new Article(information[0],information[1],information[2]);
        for (int i = 0; i < countOfLines; i++) {
            String [] command = scanner.nextLine().split(":");
            switch (command[0]){
                case"Edit":
                    article.edit(command[1]);
                    break;
                case"ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case"Rename":
                    article.rename(command[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
