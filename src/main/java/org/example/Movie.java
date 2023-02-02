package org.example;

import java.util.List;

public class Movie {
    private String name;
    private List<Director> directors;
    private  List<Genres> genres;
    private Double rating;

    public Movie(String name, List<Director> directors, List<Genres> genres, Double rating) {
        this.name = name;
        this.directors = directors;
        this.genres = genres;
        this.rating = rating;
    }

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

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void addDirector(Director d){
        this.directors.add(d);
    }

    public void addGenres(Genres g){
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
}
