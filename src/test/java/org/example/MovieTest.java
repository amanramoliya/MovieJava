package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOError;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MovieTest {
  private List<Director> directors = List.of(new Director("Sunil"));
  private List<Genre> genres = List.of(new Genre("Action"));
  Movie kgf = new BollywoodMovie("KGF", this.directors, this.genres, 9d);
  Movie missionImpossible = new HollywoodMovie("Mission Impossible", this.directors, this.genres, 8.9d);

  @Test
  @DisplayName("Check Origin of Movie")
  void getCountryOfOrigin() {
    Assertions.assertThat(kgf.getCountryOfOrigin().toLowerCase()).isEqualTo("india");
    Assertions.assertThat(missionImpossible.getCountryOfOrigin().toLowerCase()).isEqualTo("america");
  }

  @Test
  void watchTrailer() {
    Assertions.assertThatThrownBy(() -> kgf.watchTrailer());
    Assertions.catchThrowableOfType(() -> kgf.watchTrailer(), TrailerNotFoundException.class);
  }
}