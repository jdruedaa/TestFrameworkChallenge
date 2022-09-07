package org.movie;

public abstract class Movie {
    private String name;
    private double rating;

    public Movie()
    {

    }

    public Movie(Movie clone)
    {
        this.name = clone.name;
        this.rating = clone.rating;
    }

    public abstract Movie clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
