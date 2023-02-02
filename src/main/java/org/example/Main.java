package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    System.out.println("Hello world!");

    List<Director> directors = new ArrayList<>();
    directors.add(new Director("director1"));

    List<Genre> genres = new ArrayList<>();
    genres.add(new Genre("comedy"));
    Movie dhamal = new Movie("movie1", directors, genres, 9.3);

    System.out.println(dhamal);
  }
}