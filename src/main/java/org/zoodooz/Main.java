package org.zoodooz;

public class Main {
    public static void main(String[] args) {

        int stocks =  600;
        double priceOneStock = 21.77;
        double priceOfAllStocks;
        double brokerCommission;
        double totalPriceForStocks;

        priceOfAllStocks = stocks * priceOneStock;
        brokerCommission = priceOfAllStocks * 0.02;
        totalPriceForStocks = priceOfAllStocks + brokerCommission;


        System.out.println("Katarzyna zapłaciła za akcje: " + priceOfAllStocks + " zł.");
        System.out.println("Prowizja brokera wynosi: " + brokerCommission + " zł");
        System.out.println("Katarzyna w sumie zapłaciła: " + totalPriceForStocks + " zł, za " + stocks + " akcji.");
    }
}