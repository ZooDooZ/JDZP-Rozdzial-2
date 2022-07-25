package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int oneCookieKcal = 75;
        int howManyCookies;
        int howManyKcalEat;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wpisz ile ciasteczek zjadłeś/aś a podam Ci ile spożyłeś/aś kalorii: ");
        howManyCookies = keyboard.nextInt();
        System.out.println("Zjadłeś/aś " + howManyCookies + " ciasteczek.");

        howManyKcalEat = howManyCookies * oneCookieKcal;
        System.out.println("To oznacza, że spożyłeś/aś " + howManyKcalEat + " kcal.");
    }
}