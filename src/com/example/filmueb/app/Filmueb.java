package com.example.filmueb.app;

import java.util.Scanner;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Application ver. 0.4");
        Scanner sc = new Scanner(System.in);

        ApplicationDatabase ad = new ApplicationDatabase();
        ApplicationController ac = new ApplicationController(ad);

        ac.mainLoop();

    }
}
