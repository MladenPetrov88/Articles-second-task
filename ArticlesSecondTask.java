import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesSecondTask {
    static class Article {
        String title;
        String content;
        String author;

        Article (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", title, content, author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            String[] temp = scanner.nextLine().split(", ");
            String title = temp[0];
            String content = temp[1];
            String author = temp[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String input = scanner.nextLine();
        if (input.equals("title")) {
            articles.stream().sorted((p1, p2) -> p1.getTitle().compareTo(p2.getTitle())).forEach(e -> System.out.println(e));
        } else if (input.equals("content")) {
            articles.stream().sorted((p1, p2) -> p1.getContent().compareTo(p2.getContent())).forEach(e -> System.out.println(e));
        } else if (input.equals("author")) {
            articles.stream().sorted((p1, p2) -> p1.getAuthor().compareTo(p2.getAuthor())).forEach(e -> System.out.println(e));
        }
    }
}
