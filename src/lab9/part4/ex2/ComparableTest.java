package lab9.part4.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);

        System.out.println("Movie after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie);
        }

        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);

        System.out.println("Movie after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie);
        }

        System.out.println("\nSorted by year");
        Collections.sort(list);
        System.out.println("Movie after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }
}
