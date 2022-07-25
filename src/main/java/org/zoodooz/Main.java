package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        float kmPerLiter;
        double kilometersTraveled;
        double petrolLiter;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę przejechanych kilometrów: ");
        kilometersTraveled = keyboard.nextDouble();

        System.out.println("Podaj liczbę zużytych litrów paliwa: ");
        petrolLiter =  keyboard.nextDouble();

        kmPerLiter = (float) kilometersTraveled / (float) petrolLiter;
        System.out.println("Na jednym litrze przejechałeś: " + kmPerLiter + " km.");
    }
}