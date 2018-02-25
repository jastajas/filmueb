package com.example.filmueb.app;
import com.example.filmueb.model.Actor;
import com.example.filmueb.model.Film;
import com.example.filmueb.model.Series;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleDataReader {

    private static Scanner sc = new Scanner(System.in);


    public static Film createMovie() {

        sc.useLocale(Locale.US);

        System.out.println("Podaj tytuł filmu: ");
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko reżysera: ");
        String director = sc.nextLine();
        System.out.println("Podaj rok produkcji: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj gatunek filmu: ");
        String type = sc.nextLine();
        System.out.println("Podaj krótki opis: ");
        String description = sc.nextLine();
        System.out.println("Podaj ocenę: ");
        double rate = sc.nextDouble();
        sc.nextLine();

        if (name.length() <= 0 || director.length() <= 0  || year < 1895 || type.length() <= 0 || description.length() <= 0 || rate < 0 || rate > 10) {
            return null;
        } else {
            return new Film(name, director, year, type, description, rate);
        }
    }

    public static Series createTvSeries(){

        sc.useLocale(Locale.US);

        System.out.println("Podaj tytuł serialu: ");
        String name = sc.nextLine();
        System.out.println("Podaj liczbę sezonów serialu: ");
        int numberOfSesons = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj liczbę odcinków serialu: ");
        int numberOfEpisodes = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj nazwę producenta serialu: ");
        String producerName = sc.nextLine();
        System.out.println("Podaj gatunek serialu: ");
        String type = sc.nextLine();
        System.out.println("Podaj krótki opis serialu: ");
        String description = sc.nextLine();
        System.out.println("Podaj ocenę serialu: ");
        double rate = sc.nextDouble();
        sc.nextLine();
        if (numberOfEpisodes < 0 || numberOfSesons < 0 || numberOfSesons > 127){
            return null;
        } else {
            return new Series(name, numberOfSesons, numberOfEpisodes, producerName, type, description, rate);
        }
    }

    public static Actor createActor(){


        System.out.println("Podaj imię aktora: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko aktora: ");
        String lastName = sc.nextLine();
        System.out.println("Podaj kraj pochodzenia: ");
        String originCountry = sc.nextLine();

        return new Actor(firstName, lastName, originCountry);
    }
}

