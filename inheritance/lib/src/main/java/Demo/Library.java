package Demo;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class Library {
    public static void main(String[] args) {
        Restaurant bk = new Restaurant("mac", 8, "From 5$ to 45$");
//        bk.addReview("bad", "saad", 6);
        bk.addRev("nice","Ibrahim",5);
        bk.addRev("not so good","anyone",3);
//        System.out.println(bk.addRev("nice","Ibrahim",5));
        System.out.println(bk);
        Theater center = new Theater("center");
        center.addMovie("Wall-E");
        center.addMovie("up");
//        center.removeMovie("up");
        System.out.println(center);
    }

    public boolean someLibraryMethod() {
        return true;
    }
}
