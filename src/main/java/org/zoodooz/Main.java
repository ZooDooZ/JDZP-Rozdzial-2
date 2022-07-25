package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź cenę detaliczną płytki: ");
        double tileRetailPrice = keyboard.nextDouble();
        double profit = tileRetailPrice * 0.4;

        System.out.println("Twój zysk z płytki: " + profit + " zł.");
    }
}