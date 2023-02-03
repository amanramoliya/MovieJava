package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.example.Movie.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MovieUtilsTest {

  List<Movie> movies;
  MovieUtils movieUtils;
  Genre actionGenre;
  Genre comedyGenre;

  Movie kgf1;
  Movie kgf2;
  Movie kgf3;
  Movie dhamal;
  List<Director> directors;
  List<Genre> genres;



  @BeforeEach
  void setUp() {
    directors = List.of(new Director("xyz"));
    actionGenre = new Genre("Action");
    comedyGenre = new Genre("Comedy");
    genres = List.of(actionGenre);
    kgf3 = new BollywoodMovie(3l,"kgf3", directors, genres, 7.0,3);
    kgf1 = new BollywoodMovie(1l,"kgf1", directors, genres, 8.7,1);
    kgf2 = new BollywoodMovie(2l,"kgf2", directors, genres, 9.2,2);
    dhamal = new BollywoodMovie(4l,"Dhamal", directors, List.of(comedyGenre), 9.1d,4);

    movies = List.of(kgf1, kgf2, kgf3);
    movieUtils = new MovieUtils();


  }

  @Test
  @DisplayName("Sort By Rating")
  void sortByRating() {
    List<Movie> sortedMovies = movieUtils.sortByRating(movies);
    List<Movie> expectedList = List.of(kgf3, kgf1, kgf2);
    Assertions.assertThat(sortedMovies).containsExactlyElementsOf(expectedList);
  }

  @Test
  @DisplayName("Sort By Name")
  void sortByName() {
    List<Movie> sortedMovies = movieUtils.sortByName(movies);
    List<Movie> expectedList = List.of(kgf1, kgf2, kgf3);
    Assertions.assertThat(sortedMovies).containsExactlyElementsOf(expectedList);
  }

  @Test
  @DisplayName("Movies Created By Director")
  void directorsMovieCount() {
    Map<String, Long> directorsmovie = movieUtils.getCount(movies);
    Assertions.assertThat(directorsmovie.get("xyz")).isEqualTo(3);
  }

  @Test
  @DisplayName("No Of Movies Of Genre")
  void genreMovieCount() {
    Map<Genre, Long> genreCount = movieUtils.getGenreCount(movies);
    Assertions.assertThat(genreCount.get(actionGenre)).isEqualTo(3l);
  }

  @Test
  @DisplayName("Movies by genre")
  void getMoviesOfGenre() {
    movies = Stream.concat(movies.stream(), List.of(dhamal).stream()).toList();

    List<Movie> actionMovies = movieUtils.getMoviesOfGenre(actionGenre, movies);
    Assertions.assertThat(actionMovies).containsAll(List.of(kgf1,kgf2,kgf3));

    List<Movie> comedyMovies = movieUtils.getMoviesOfGenre(comedyGenre, movies);
    Assertions.assertThat(comedyMovies).containsAll(List.of(dhamal));
  }


}