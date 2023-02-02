package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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


    public Map<String, Long> getCount(List<Movie> movies) {

        //  One way

        Map<String, Long> count = new HashMap<String, Long>();
        for (Movie currentMovie : movies) {
            for (Director d : currentMovie.getDirectors()) {
                if (count.containsKey(d.getName())) {
                    count.replace(d.getName(), count.get(d.getName()) + 1);
                } else {
                    count.put(d.getName(), (long) 1);

                }
            }
        }
//        return count;


//        Anoter Way Declarative way
        return movies
                .stream()
                .map(movie -> movie.getDirectors())
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
    }
}
