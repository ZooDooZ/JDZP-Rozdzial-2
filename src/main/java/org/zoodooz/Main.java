package org.zoodooz;

public class Main {
    public static void main(String[] args) {
        
        // liczba zakupionych akcji
        int numberOfPurchasedStocks =  1000;
        //cena zakupy pojedyńczej akcji
        double priceOfPurchasedOneStock = 32.87;
        //prowizja brokera 2%
        double brokerCommission = 0.02;
        //obliczona prowizja brokera po zakupie akcji
        double brokerCommissionAfterPurchased = (numberOfPurchasedStocks * priceOfPurchasedOneStock) * brokerCommission;

        //liczba sprzedanych akcji
        int numberOfSoldStock = 1000;
        //cena sprzedaży pojedyńczej akcji
        double priceOfSoldOneStock = 33.92;
        //obliczona prowizja brokera po sprzedaży akcji
        double brokerCommissionAfterSold =  (numberOfSoldStock * priceOfSoldOneStock) * brokerCommission;

        //obliczam kwotę zapłaconą za zakup akcji wraz z prowizją
        double sumPayForPurchasedStocks = (numberOfPurchasedStocks * priceOfPurchasedOneStock) + brokerCommissionAfterPurchased;
        System.out.println("Jacek za:  " + numberOfPurchasedStocks + " akcji zapłacił " + sumPayForPurchasedStocks + " zł.");


        System.out.println("Wartość prowizji przy zakupie akcji wynosiła: " + brokerCommissionAfterPurchased + " zł.");

        //obliczam kwotę otrzymaną ze sprzedaży akcji bez prowizji
        double sumAfterSoldStocks = numberOfSoldStock * priceOfSoldOneStock;
        System.out.println("Kwota otrzymana ze sprzedaży akcji: " + sumAfterSoldStocks);

        System.out.println("Wartość prowizji przy sprzedaży akcji wynosiła: " + brokerCommissionAfterSold + " zł.");

        //obliczam kwotę otrzymaną ze sprzedaży akcji z potrąconą prowizją
        double sumAfterSoldStockWithCommission = sumAfterSoldStocks - brokerCommissionAfterSold;

        //obliczam zysk miedzy zakupem akcji a sprzedażą akcji
        double profitAfterTransaction = sumAfterSoldStockWithCommission - sumPayForPurchasedStocks;

        System.out.println("Zyska jacka ze sprzedaży akcji po zapłaceniu obu prowizji\n" +
                             "(jeśli zysk wyświetlany jest z ujemny to oznacza, że poniósł strate): "
                            + profitAfterTransaction);
    }
}