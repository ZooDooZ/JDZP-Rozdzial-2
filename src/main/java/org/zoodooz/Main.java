package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwę twojego ulubionego miasta: ");
        String townName = keyboard.nextLine();

        System.out.println("Liczba znaków w nazwie miasta: "+ townName.length());
        System.out.println("Nazwa miasta z wielkiej litery: "+ townName.toUpperCase());
        System.out.println("Nazwa miasta z małej litery: "+ townName.toLowerCase());
        System.out.println("Pierwsza litera miasta: "+ townName.charAt(0));
    }
}