package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numberOfWomen;
        double numberOfMan;
        double allPeople;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę kobiet zarejestrowanych na kurs: ");
        numberOfWomen = keyboard.nextInt();

        System.out.println("Wprowadź liczbę mężczyzn zarejestrowanych na kurs: ");
        numberOfMan = keyboard.nextInt();

        allPeople = numberOfMan + numberOfWomen;
        float percentageOfWomen = (float)numberOfWomen / (float)allPeople;
        float percentageOfMan = (float)numberOfMan / (float)allPeople;

        percentageOfWomen = percentageOfWomen * 100;
        percentageOfMan = percentageOfMan * 100;

        System.out.println("Odsetek kobiet na kursie: " + percentageOfWomen + " %\n" +
                            "Odsetek mężczyzn na kursie: " + percentageOfMan + " %");
    }
}