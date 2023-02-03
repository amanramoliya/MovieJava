package org.example.Movie;

import java.util.List;

public class BollywoodMovie extends Movie {

  public BollywoodMovie(Long id, String name, List<Director> directors, List<Genre> genres,
                        Double rating,Integer trailerId ) {
    super(id,name, directors, genres, rating, trailerId);
  }

  @Override
  public String getCountryOfOrigin() {
    return "India";
  }
}
