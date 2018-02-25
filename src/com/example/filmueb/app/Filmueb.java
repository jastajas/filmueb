package com.example.filmueb.app;
import com.example.filmueb.model.Actor;
import com.example.filmueb.model.Film;
import com.example.filmueb.model.Series;

import java.util.ArrayList;
import java.util.Scanner;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Application ver. 0.3");
        Scanner sc = new Scanner(System.in);

        ArrayList<Film> films = new ArrayList<>();
        ArrayList<Actor> actors = new ArrayList<>();
        ArrayList<Series> series = new ArrayList<>();


        Option[] options = Option.values();

        int a = 0;
        do {
            System.out.println("Proszę wybrać nr opcji: ");
            for (int i = 0; i < options.length; i++) {
                System.out.println(options[i].toString());
            }
            System.out.println("Nr opcji: ");
            try {
                switch (a = sc.nextInt()) {
                    case 0:
                        films.add(ConsoleDataReader.createMovie());
                        break;
                    case 1:
                        actors.add(ConsoleDataReader.createActor());
                        break;
                    case 2:
                        series.add(ConsoleDataReader.createTvSeries());
                        break;
                    case 3:
                        System.out.println(films.toString());
                        break;
                    case 4:
                        System.out.println(actors.toString());
                        break;
                    case 5:
                        System.out.println(series.toString());
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Nie ma takiego nr opcji.");
                        a = 0;
                }
            } catch (Exception e) {
                System.out.println("Wprowadzono błędne dane.");
                a = 0;
                sc.nextLine();
            }

        }while (!options[a].name().equals("END_PROGRAM"));

        System.out.println("Działanie programu dobiegło końca.");
        /*try{
            Film film1 = cdr.createMovie();
            System.out.println(film1.toString());
        }
        catch (NullPointerException n){
            System.out.println("Brak danych lub podano nieprawidłowe informacje.");
        }

        try{
            Series series1 = cdr.createTvSeries();
            System.out.println(series1.toString());
        }
        catch (NullPointerException n){
            System.out.println("Brak danych lub podano nieprawidłowe informacje.");
        }

        try{
            Actor actor1 = cdr.createActor();
            System.out.println(actor1.toString());
        }
        catch (NullPointerException n){
            System.out.println("Brak danych lub podano nieprawidłowe informacje.");
        }*/


        /*Film film1 = new Film("Lucy", "Luc Besson", 2014, "Sci-Fi", "Podczas przemytu narkotyków w swoim organizmie Lucy przypadkowo zyskuje nadprzyrodzone zdolności.", 6.3);
        Actor actor1 = new Actor("Scarlett", "Johansson", "USA");
        Series series1 = new Series("Jak poznałem waszą matkę",  9, 208, "Cartera Baysa", "Komedia", "Ted, wspominając dawne lata, opowiada dzieciom o swoich przyjaciołach i okolicznościach, w których poznał ich matkę.", 8.1);
*/

    }
}
