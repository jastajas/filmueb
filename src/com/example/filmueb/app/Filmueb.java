package com.example.filmueb.app;
import com.example.filmueb.model.Actor;
import com.example.filmueb.model.Film;
import com.example.filmueb.model.Series;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Application ver. 0.1");

        Film film1 = new Film("Lucy", "Luc Besson", 2014, "Sci-Fi", "Podczas przemytu narkotyków w swoim organizmie Lucy przypadkowo zyskuje nadprzyrodzone zdolności.", 6.3);
        Actor actor1 = new Actor("Scarlett", "Johansson", "USA");
        Series series1 = new Series("Jak poznałem waszą matkę",  9, 208, "Cartera Baysa", "Komedia", "Ted, wspominając dawne lata, opowiada dzieciom o swoich przyjaciołach i okolicznościach, w których poznał ich matkę.", 8.1);

        System.out.println(film1);
        System.out.println(actor1);
        System.out.println(series1);

    }
}
