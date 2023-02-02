package org.example;

import java.util.function.Function;

public class Genre {

  private String type;

  public Genre(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Genres{" +
           "type='" + type + '\'' +
           '}';
  }

}
