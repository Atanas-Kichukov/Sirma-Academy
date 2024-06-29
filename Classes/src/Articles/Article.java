package Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Article setContent(String content) {
        this.content = content;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Article setAuthor(String author) {
        this.author = author;
        return this;
    }

    public void edit(String content) {
        setContent(content);
    }

    public void changeAuthor(String author) {
        setAuthor(author);
    }

    public void rename(String title) {
        setTitle(title);
    }

    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
}
