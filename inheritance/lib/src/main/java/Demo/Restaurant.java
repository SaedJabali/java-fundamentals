package Demo;


public class Restaurant extends ReviewClass {
    private String name;
    private int stars;
    private String price;
//    private Object ReviewClass;

    public Restaurant(String name, int stars, String price) {
        super(Review.body, Review.author, Review.star);
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }

    public Object addRev(String body, String author, int star){
        this.body=body;
        this.author=author;
        this.star=star;
        rev.add("comment= "+body);
        rev.add("author= "+author);
        rev.add("Rate= "+Integer.toString(star));
        return null;
    }
//    public Object addReview(String body, String author, int star) {
//        this.body = body;
//        this.author = author;
//        this.star = star;
//        return null;
//    }

    @Override
    public String toString() {
        return "Restaurant {" +
                "name='" + name + '\'' +
                ", star=" + star +
                ", price='" + price + '\'' + '\'' +
                showRev() + '}';
    }
}
