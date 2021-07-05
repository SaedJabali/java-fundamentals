package Demo;

import java.util.ArrayList;
import java.util.List;

public class ReviewClass implements Review {
    protected static String body;
    protected static int star;
    public static String author;

    List<String> rev = new ArrayList<>();

    public ReviewClass(String body, String author, int star) {
        this.body = body;
        this.author = author;
        this.star = star;
//        rev.add(ReviewClass.body);
//        rev.add(ReviewClass.author);
//        rev.add(Integer.toString(ReviewClass.star));

    }

    public static String getBody() {
        return body;
    }

    public static void setBody(String body) {
        ReviewClass.body = body;
    }

    public static int getStar() {
        return star;
    }

    public static void setStar(int star) {
        ReviewClass.star = star;
    }

    public static String getAuthor() {
        return author;
    }

    public static void setAuthor(String author) {
        ReviewClass.author = author;
    }

//    public Object addRev(String body, String author, int star){
//        rev.add("comment= "+this.body);
//        rev.add("author= "+this.author);
//        rev.add("Rate= "+Integer.toString(this.star));
//return null;
//    }
    @Override
    public void reviewCon(String body, String author, int star) {

    }

//    @Override
//    public String toString() {
//        return "ReviewClass{" +
//                "rev=" + rev +
//                '}';
//    }

    public String showRev(){
        return "Review {" +
                rev +
                '}';
    }

//    @Override
//    public String toString() {
//
}
