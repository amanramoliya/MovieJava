package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {

    System.out.println("Hello world!");

    List<Director> directors = new ArrayList<>();
    directors.add(new Director("director1"));

    List<Genre> genres = new ArrayList<>();
    genres.add(new Genre("comedy"));
    Movie dhamal = new BollywoodMovie("Dhamal", directors, genres, 9.3);

    System.out.println(dhamal);

    dhamal.watchTrailer();
  }
}