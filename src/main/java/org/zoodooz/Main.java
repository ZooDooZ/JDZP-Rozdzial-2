package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //długość rzędu w metrach
        double rowLength;
        //ilość miejsca zajmowanego przez okratowania w metrach
        double trellisArea;
        //odległość miedzy sadzonkami w metrach
        double lengthBetweenSeedling;
        //liczba sadzonek jakie można uwmieścić w rzędzie
        double numberOfSeeds;

        Scanner keyboard =  new Scanner(System.in);

        System.out.println("Wprowadź długość rzędu w metrach: ");
        rowLength = keyboard.nextDouble();

        System.out.println("Wprowadź ilość miejsca zajmowanego przez okratowanie w metrach: ");
        trellisArea = keyboard.nextDouble();

        System.out.println("Wprowadź odległość między sadzonkami w metrach: ");
        lengthBetweenSeedling = keyboard.nextDouble();

        numberOfSeeds = (rowLength - 2 * trellisArea) / lengthBetweenSeedling;
        int numberOfSeedsInt = (int)numberOfSeeds;

        System.out.println("W jednym rzędzie zmieścisz: " + numberOfSeedsInt + " sadzonek.");
    }
}