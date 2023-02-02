package org.example;

public class Genres {

    private String type;

    public Genres(String type) {
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
