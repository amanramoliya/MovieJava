package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    List<Movie> movies;
    MovieService movieService;

    Movie kgf1;
    Movie kgf2;
    Movie kgf3;


    @BeforeEach
    void setUp() {
        List<Director> directors = List.of(new Director("xyz"));
        List<Genres> genres = List.of(new Genres("Action"));
        kgf3 = new Movie("kgf3", directors, genres, 7.0);
        kgf1 = new Movie("kgf1", directors, genres, 8.7);
        kgf2 = new Movie("kgf2", directors, genres, 9.2);
        movies = List.of(kgf1, kgf2, kgf3);
        movieService = new MovieService();
    }

    @Test
    @DisplayName("Sort By Rating")
    void sortByRating() {
        List<Movie> sortedMovies = movieService.sortByRating(movies);
        List<Movie> expectedList = List.of(kgf3, kgf1, kgf2);
        Assertions.assertThat(sortedMovies).containsExactlyElementsOf(expectedList);
    }

    @Test
    void sortByName() {
        List<Movie> sortedMovies = movieService.sortByName(movies);
        List<Movie> expectedList = List.of(kgf1, kgf2, kgf3);
        Assertions.assertThat(sortedMovies).containsExactlyElementsOf(expectedList);
    }
}