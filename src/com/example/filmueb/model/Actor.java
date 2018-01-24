package com.example.filmueb.model;

public class Actor {
    private String firstName;
    private String lastName;
    private String originCountry;

    public Actor(String firstName, String lastName, String originCountry) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.originCountry = originCountry;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
