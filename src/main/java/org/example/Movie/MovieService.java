package org.example.Movie;

public class MovieService {
    private final MovieReposetory movieReposetory;

    MovieService(MovieReposetory movieReposetory){
        this.movieReposetory=movieReposetory;
    }

    public Movie getMovie(Long id){
        return movieReposetory.getById(id);
    }



}
