package org.zoodooz;

public class Main {
    public static void main(String[] args) {
        
        int numberOfConsumers = 12467;

        int consumersBuyEnergeticPerWeek = (int) (numberOfConsumers * 0.14);
        int consumersBuyCitrusEnergetic = (int) (consumersBuyEnergeticPerWeek * 0.64);

        System.out.println("Przybliżona liczba ankietowanych osób kupująca przynajmniej \n" +
                           "jeden napój energetyczny tygodniowo: " + consumersBuyEnergeticPerWeek);
        System.out.println("Przybliżona liczba ankietowanych osób preferująca napoje energetyczne \n" +
                            "o smaku cytrusowym: " + consumersBuyCitrusEnergetic);
    }
}