package Article2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Article> articles = new ArrayList<>();


        int add = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < add ; i++) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article1 = new Article(title,content,author);
            articles.add(article1);

        }

        String sort = scanner.nextLine();
        switch (sort){
            case "title":
                articles.stream().sorted((article1, article2) -> article1.getTitle().compareTo(article2.getTitle())).forEach(System.out::println);
                break;
            case "content":
                articles.stream().sorted((article1, article2) -> article1.getContent().compareTo(article2.getContent())).forEach(System.out::println);
                break;
            case "author":
                articles.stream().sorted((article1, article2) -> article1.getAuthor().compareTo(article2.getAuthor())).forEach(System.out::println);
                break;
        }
    }
}
