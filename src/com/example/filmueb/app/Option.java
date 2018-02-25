package com.example.filmueb.app;

import com.example.filmueb.model.Film;

import java.util.ArrayList;
import java.util.Scanner;

public enum Option {
        ADD_FILM("Dodaj film"),
        ADD_ACTOR("Dodaj actora/aktorkę"),
        ADD_SERIES("Dodaj serial"),
        SHOW_FILMS("Pokaż filmy"),
        SHOW_ACTORS("Pokaż aktorów"),
        SHOW_SERIES("Pokaż seriale"),
        END_PROGRAM("Zakończ program");

        private String optionName;

     Option(String optionName){
             this.optionName = optionName;
     }

        public String getOptionName() {
                return optionName;
        }

        @Override
        public String toString() {
                return ordinal() + " - " + optionName;
        }
}
