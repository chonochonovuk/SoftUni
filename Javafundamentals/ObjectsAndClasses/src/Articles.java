import javafx.application.Preloader;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    static class Titles{
        private String title;
        private String content;
        private String author;

        public Titles(String title,String content,String author){

            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Titles> articles = new ArrayList<>();
        String readInput = scanner.nextLine();
        String[] firstEntry = readInput.split(", ");
        String title = firstEntry[0];
        String content = firstEntry[1];
        String author = firstEntry[2];

        Titles titles = new Titles(title,content,author);
        articles.add(titles);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commToArr = command.split(": ");

            switch (commToArr[0]) {
                case "Edit":
                    String newContent = commToArr[1];
                    titles.setContent(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commToArr[1];
                    titles.setAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = commToArr[1];
                    titles.setTitle(newTitle);
                    break;
            }
        }




    }
}
