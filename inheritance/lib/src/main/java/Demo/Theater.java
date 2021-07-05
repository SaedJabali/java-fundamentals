package Demo;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Theater extends ReviewClass {
    String name;
    List<String> movies = new ArrayList<>();
//    int Star;

    public Theater(String name) {
        super(body, author, star);
        this.name = name;
//        this.movies = new ArrayList<>();
//        this.Star = Star;
    }

    public String getName() {
        return name;
    }

    public List getMovies() {
        return movies;
    }

    public void addMovie(String name) {
        movies.add(name);
    }

    public void removeMovie(String name) {
        movies.remove(movies.indexOf(name));
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
