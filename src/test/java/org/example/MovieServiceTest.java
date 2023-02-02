package org.example;

import java.util.List;
import java.util.Map;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MovieServiceTest {

  List<Movie> movies;
  MovieService movieService;
  Genre actionGenre;

  Movie kgf1;
  Movie kgf2;
  Movie kgf3;


  @BeforeEach
  void setUp() {
    List<Director> directors = List.of(new Director("xyz"));
    actionGenre = new Genre("Action");
    List<Genre> genres = List.of(actionGenre);
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
  @DisplayName("Sort By Name")
  void sortByName() {
    List<Movie> sortedMovies = movieService.sortByName(movies);
    List<Movie> expectedList = List.of(kgf1, kgf2, kgf3);
    Assertions.assertThat(sortedMovies).containsExactlyElementsOf(expectedList);
  }

  @Test
  @DisplayName("Movies Created By Director")
  void directorsMovieCount() {
    Map<String, Long> directorsmovie = movieService.getCount(movies);
    Assertions.assertThat(directorsmovie.get("xyz")).isEqualTo(3);
  }

  @Test
  @DisplayName("No Of Movies Of Genre")
  void genreMovieCount() {
    Map<Genre, Long> genreCount = movieService.getGenreCount(movies);
    Assertions.assertThat(genreCount.get(actionGenre)).isEqualTo(3l);
  }
}