package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner keyborad = new Scanner(System.in);

        System.out.println("Wprowadź wartość wprowadzanego produktu: ");
        double valueOfProduct = keyborad.nextDouble();
        System.out.println("Wartość produktu wynosi: " + valueOfProduct + " USD");

        double stateTax = valueOfProduct * 0.04;
        System.out.println("Podatek stanowy od tego produktu wynosi: " + stateTax + " USD");


        double localTax = valueOfProduct * 0.02;
        System.out.println("Podatek lokalny od tego produktu wynosi: " + localTax + " USD");

        double finalPriceOfProduct = valueOfProduct + stateTax + localTax;
        System.out.println("Lączna cena sprzedaży tego produktu wynosi: " + finalPriceOfProduct + " USD");
    }
}