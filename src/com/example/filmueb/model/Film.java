package com.example.filmueb.model;

public class Film {
   private String name;
   private String director;
   private int year;
   private String type;
   private String description;
   private double rate;

    public Film(String name, String director, int year, String type, String description, double rate) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.type = type;
        this.description = description;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                '}';
    }
}
