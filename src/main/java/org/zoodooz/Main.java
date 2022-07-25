package org.zoodooz;

public class Main {
    public static void main(String[] args) {

        double sellValuePerYear = 4600000.0;
        double sellValueMasovianRegion;

        sellValueMasovianRegion = sellValuePerYear * 0.62;
        System.out.println("W ciągu roku region mazowiecki wygeneruje sprzedaż: " + sellValueMasovianRegion + " zł");
    }
}