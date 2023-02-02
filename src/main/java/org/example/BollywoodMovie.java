package org.example;

import java.util.List;

public class BollywoodMovie extends Movie {

  public BollywoodMovie(String name, List<Director> directors, List<Genre> genres,
      Double rating) {
    super(name, directors, genres, rating);
  }

  @Override
  public String getCountryOfOrigin() {
    return "India";
  }
}
