package org.example;

import java.util.Comparator;
import java.util.List;

public class MovieService {

    public List<Movie> sortByRating(List<Movie> movies) {
//        Comparator<Movie> ratingComparator = new Comparator<Movie>() {
//            @Override
//            public int compare(Movie o1, Movie o2) {
//                if (o1.getRating() > o2.getRating()) {
//                    return 1;
//                } else if (o1.getRating() < o2.getRating()) {
//                    return -1;
//                }
//                return 0;
//            }
//        };
        return movies.stream().sorted((Movie o1, Movie o2) -> {
            if (o1.getRating() > o2.getRating()) {
                return 1;
            } else if (o1.getRating() < o2.getRating()) {
                return -1;
            }
            return 0;
        }).toList();
    }

    public List<Movie> sortByName(List<Movie> movies) {
        return movies.stream().sorted((Movie m1, Movie m2) -> m1.getName().compareToIgnoreCase(m2.getName())).toList();
    }


}
