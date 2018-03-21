package com.example.filmueb.app;

import java.util.Scanner;

public class ApplicationController {

    ApplicationDatabase ad;
    Option[] options;
    Scanner sc;

    public ApplicationController(ApplicationDatabase ad) {

        this.ad = ad;
        options = Option.values();
        sc = new Scanner(System.in);
    }

    public void mainLoop() {
        int optionNo = 0;
        int loopCtrl = 0;

        do {
            printOption();

            optionNo = sc.nextInt();

            loopCtrl = runFunction(optionNo);


        } while (!options[loopCtrl].name().equals("END_PROGRAM"));

        System.out.println("Działanie programu dobiegło końca.");

    }

    private void printOption() {

        System.out.println("Proszę wybrać nr opcji: ");

        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i].toString());
        }

        System.out.println("Nr opcji: ");
    }


    private int runFunction(int optionNo) {

        try {
            switch (optionNo) {
                case 0:
                    ad.getFilms().add(ConsoleDataReader.createFilm());
                    break;
                case 1:
                    ad.getActors().add(ConsoleDataReader.createActor());
                    break;
                case 2:
                    ad.getSeries().add(ConsoleDataReader.createTvSeries());
                    break;
                case 3:
                    System.out.println(ad.getFilms().toString());
                    break;
                case 4:
                    System.out.println(ad.getActors().toString());
                    break;
                case 5:
                    System.out.println(ad.getSeries().toString());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Nie ma takiego nr opcji.");
                    optionNo = 0;
            }
        } catch (Exception e) {
            System.out.println("Wprowadzono błędne dane.");
            optionNo = 0;
            sc.nextLine();
        }
        return optionNo;
    }

}
       
       
           
   

        
