package org.example.Movie;

import java.util.Objects;

public class Genre {

  private String type;

  public Genre(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }


  @Override
  public String toString() {
    return "Genres{" +
           "type='" + type + '\'' +
           '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Genre genre)) return false;
    return Objects.equals(type, genre.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }
}
