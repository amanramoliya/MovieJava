package org.example;

import org.example.Movie.BollywoodMovie;
import org.example.Movie.Director;
import org.example.Movie.Genre;
import org.example.Movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {

    System.out.println("Hello world!");




    List<Director> directors = new ArrayList<Director>();
    directors.add(new Director("director1"));

    List<Genre> genres = new ArrayList<Genre>();
    genres.add(new Genre("comedy"));

    Movie dhamal = new BollywoodMovie(4l,"Dhamal", directors, genres, 9.3,4);

    System.out.println(dhamal);
  }
}