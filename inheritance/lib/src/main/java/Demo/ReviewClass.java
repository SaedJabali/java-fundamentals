package Demo;

public class ReviewClass implements Review {
    protected static String body;
    protected static int star;
    public static String author;

    public ReviewClass(String body, String author, int star) {
        ReviewClass.body = body;
        ReviewClass.author = author;
        ReviewClass.star = star;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStar() {
        return ReviewClass.star;
    }

    @Override
    public String toString() {
        return "ReviewClass{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", star=" + star +
                '}';
    }
}
