package org.example;

import java.util.List;

public class HollywoodMovie extends Movie{

  public HollywoodMovie(String name, List<Director> directors, List<Genre> genres,
      Double rating) {
    super(name, directors, genres, rating);
  }

  @Override
  public String getCountryOfOrigin() {
    return "America";
  }
}
