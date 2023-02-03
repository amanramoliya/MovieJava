package org.example.Movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;

class MovieServiceTest {
    MovieReposetory movieReposetory;
    MovieService movieService;

    @BeforeEach
    void setUp() {
        movieReposetory = Mockito.mock(MovieReposetory.class);

        movieService = new MovieService(movieReposetory);

    }

    @Test
    @DisplayName("fetchMovieById from MovieReposetory")
    void getMovie() {
        movieService.getMovie(anyLong());
        Mockito.verify(movieReposetory).getById(anyLong());
    }
}