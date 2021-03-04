import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<ArticleTwo> listOfArticles = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            ArticleTwo article = new ArticleTwo(title, content, author);

            listOfArticles.add(article);

        }

        String inputToOrder = scanner.nextLine();
//        "title", "content", "author".

        if ("title".equals(inputToOrder)) {
            listOfArticles.sort((f, s) -> f.getTitle().compareTo(s.getTitle()));
        } else if ("content".equals(inputToOrder)) {
            listOfArticles.sort((f, s) -> f.getContent().compareTo(s.getContent()));
        } else if ("author".equals(inputToOrder)) {
            listOfArticles.sort((f, s) -> f.getAuthor().compareTo(s.getAuthor()));
        }

        for (ArticleTwo listOfArticle : listOfArticles) {
            System.out.println(listOfArticle.toString());
        }

    }

    static class ArticleTwo {
        private String title;
        private String content;
        private String author;

        public ArticleTwo(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
