package org.example;

import java.util.List;

public abstract class Movie {

  private String name;
  private List<Director> directors;
  private List<Genre> genres;
  private Double rating;

  public Movie(String name, List<Director> directors, List<Genre> genres, Double rating) {
    this.name = name;
    this.directors = directors;
    this.genres = genres;
    this.rating = rating;
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

  public void setName(String name) {
    this.name = name;
  }

  public List<Director> getDirectors() {
    return directors;
  }

  public void setDirectors(List<Director> directors) {
    this.directors = directors;
  }

  public List<Genre> getGenres() {
    return genres;
  }

  public void setGenres(List<Genre> genres) {
    this.genres = genres;
  }

  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public void addDirector(Director d) {
    this.directors.add(d);
  }

  public void addGenres(Genre g) {
    this.genres.add(g);
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
