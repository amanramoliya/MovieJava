package org.example;


import org.example.Trailer.MovieTrailerService;
import org.example.Trailer.Trailer;
import org.assertj.core.api.Assertions;
import org.example.Trailer.TrailerReposetory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;


class TrailerServiceTest {

    TrailerReposetory movieTrailerGetway;

    MovieTrailerService movieTrailerService;

    @BeforeEach
    void setUp() {
//        movieTrailerGetway = new MovieTrailerGetway();

//        movieTrailerService = new MovieTrailerService(movieTrailerGetway);

        movieTrailerGetway = Mockito.mock(TrailerReposetory.class);
        Mockito.when(movieTrailerGetway.getById(anyInt())).thenReturn(new Trailer("https://trailer.com"));
        movieTrailerService = new MovieTrailerService(movieTrailerGetway);
    }

    @Test
    @DisplayName("Get Trailer from Getway")
    void getTrailer() {

        //when
        String trailerUrl = movieTrailerService.getTrailer(1);


        //then
        Mockito.verify(movieTrailerGetway).getById(anyInt());

        Assertions.assertThat(trailerUrl).isEqualTo("https://trailer.com");
    }
}