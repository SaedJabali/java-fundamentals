package Demo;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class Library {
    public static void main(String[] args) {
        Restaurant bk = new Restaurant("mac", 8, "From 5$ to 45$");
        bk.addReview("bad", "saad", 6);

        System.out.println("Resturant: " + bk.getName() + "," + " Rate: " + bk.getStars() + "," + " Meal price: " + bk.getPrice());
        System.out.println("Review for the resturant: " + " Author is " + bk.getAuthor() + "," + " Comment: " + bk.getBody() + "," + " Rate given: " + bk.getStar());
    }

    public boolean someLibraryMethod() {
        return true;
    }
}
