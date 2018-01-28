package com.example.filmueb.app;
import com.example.filmueb.model.Actor;
import com.example.filmueb.model.Film;
import com.example.filmueb.model.Series;

import java.util.Scanner;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Application ver. 0.2");

        ConsoleDataReader cdr = new ConsoleDataReader(new Scanner(System.in));

        try{
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
        }


        /*Film film1 = new Film("Lucy", "Luc Besson", 2014, "Sci-Fi", "Podczas przemytu narkotyków w swoim organizmie Lucy przypadkowo zyskuje nadprzyrodzone zdolności.", 6.3);
        Actor actor1 = new Actor("Scarlett", "Johansson", "USA");
        Series series1 = new Series("Jak poznałem waszą matkę",  9, 208, "Cartera Baysa", "Komedia", "Ted, wspominając dawne lata, opowiada dzieciom o swoich przyjaciołach i okolicznościach, w których poznał ich matkę.", 8.1);
*/

    }
}
