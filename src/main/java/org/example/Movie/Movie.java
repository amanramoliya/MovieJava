package org.example.Movie;

import java.util.List;

public abstract class Movie {

  private Long id;
  private String name;
  private List<Director> directors;
  private List<Genre> genres;
  private Double rating;
  private final int trailerId;

  public Movie(Long id, String name, List<Director> directors, List<Genre> genres, Double rating, int trailerId) {
    this.name = name;
    this.id=id;
    this.directors = directors;
    this.genres = genres;
    this.rating = rating;
    this.trailerId = trailerId;
  }

//    @Override
//    public int compareTo(Movie o) {
//        if(this.rating>o.rating){
//            return 1;
//        }
//        else if(this.rating<o.rating){
//            return -1;
//        }
//        return 0;
//    }

  public String getName() {
    return name;
  }


  public List<Director> getDirectors() {
    return directors;
  }


  public List<Genre> getGenres() {
    return genres;
  }

  public Double getRating() {
    return rating;
  }

  @Override
  public String toString() {
    return "Movie{" +
           "name='" + name + '\'' +
           ", directors=" + directors +
           ", genres=" + genres +
           ", rating=" + rating +
           '}';
  }

  public abstract String getCountryOfOrigin();



}
