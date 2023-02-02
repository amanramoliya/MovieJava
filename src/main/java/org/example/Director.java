package org.example;

import java.util.Objects;

public class Director {

  private String name;

  public Director(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Director{" +
           "name='" + name + '\'' +
           '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Director director)) {
      return false;
    }
    return Objects.equals(getName(), director.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }
}
