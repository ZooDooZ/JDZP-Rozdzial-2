package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double glassOfSugar = 1.5;
        double glassOfButter = 1.0;
        double glassOfFlour = 2.75;
        int cookies = 48;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz ile ciasteczek chcesz zrobić a powiem Ci ile składników użyc:");
        int numberOfCookies = keyboard.nextInt();

        // Calculate how many ingredients I need to make 1 cookies:
        double sugar = 1.5 / 48;
        double butter = 1.0 / 48;
        double flour = 2.75 / 48;


        float recomendGlassOfSugar = (float) (numberOfCookies * sugar);
        float recomendGlassOfButter = (float) (numberOfCookies * butter);
        float recomendGlassOfFlour = (float) (numberOfCookies * flour);

        System.out.println("Aby zrobić " + numberOfCookies + " ciasteczek potrzebujesz: ");
        System.out.println(recomendGlassOfSugar + " szklanki cukru.");
        System.out.println(recomendGlassOfButter + " szklanki masła.");
        System.out.println(recomendGlassOfFlour + " szklanki mąki.");
    }
}