package org.example.Trailer;

public class MovieTrailerService {

    private TrailerReposetory movieTrailerGetway;

    public MovieTrailerService(TrailerReposetory movieTrailerGetway) {
        this.movieTrailerGetway = movieTrailerGetway;

    }

    public String getTrailer(Integer id) {

        String trailerUrl = this.movieTrailerGetway.getById(id).getUrl();
        return trailerUrl;
    }
}
