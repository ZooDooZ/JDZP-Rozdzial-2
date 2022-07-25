package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        double avarageOfTest;

        System.out.println("Podaj swój wynik z pierwszego testu: ");
        double firstTest = keyboard.nextDouble();

        System.out.println("Podaj swój wynik z drugiego testu: ");
        double secondTest = keyboard.nextDouble();

        System.out.println("Podaj swój wynik z trzeciego testu: ");
        double thirdTest = keyboard.nextDouble();

        System.out.println("Wynik z pierwszego testu: " + firstTest);
        System.out.println("Wynik z drugiego testu: " + secondTest);
        System.out.println("Wynik z trzeciego testu: " + thirdTest);

        avarageOfTest = (firstTest + secondTest + thirdTest) / 3;
        System.out.println("Twój średni wynik z trzech testów: " + avarageOfTest);
    }
}