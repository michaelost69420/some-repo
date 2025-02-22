package ObjectsAndClassesExercise.Articles;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public String toString () {
        return title + " - " + content + ": " + author;
    }
}
