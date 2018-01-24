package com.example.filmueb.model;

public class Series {
    private String name;
    private int numberOfSesons;
    private int numberOfEpisodes;
    private String producerName;
    private String type;
    private String description;
    private double rate;

    public Series(String name, int numberOfSesons, int numberOfEpisodes, String producerName, String type, String description, double rate) {
        this.name = name;
        this.numberOfSesons = numberOfSesons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.producerName = producerName;
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

    public int getNumberOfSesons() {
        return numberOfSesons;
    }

    public void setNumberOfSesons(int numberOfSesons) {
        this.numberOfSesons = numberOfSesons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
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
        return "Series{" +
                "name='" + name + '\'' +
                ", numberOfSesons=" + numberOfSesons +
                ", numberOfEpisodes=" + numberOfEpisodes +
                ", producerName='" + producerName + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                '}';
    }
}
