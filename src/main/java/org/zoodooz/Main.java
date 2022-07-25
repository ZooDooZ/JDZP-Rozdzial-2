package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź cenę posiłku: ");
        double mealPrice = keyboard.nextDouble();
        double taxOfMeal = mealPrice * 0.0675;
        double tipForMeal = (mealPrice + taxOfMeal) * 0.2;
        double totalPrice = mealPrice + taxOfMeal + tipForMeal;

        System.out.println("Cena posiłku: " + mealPrice);
        System.out.println("Wartość podatku: " + taxOfMeal);
        System.out.println("Wysokość napiwku: " + tipForMeal);
        System.out.println("Lączna kwota do zapłaty: " + totalPrice);
    }
}