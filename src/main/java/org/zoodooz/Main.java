package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sumAfterSomeYear; //A to kwota pieniędzy na koncie po określonej liczbie lat
        double firstDeposit; //P to kwota pierwotnie zdeponowana na koncie
        double annualInterestRate; ; //r to roczna stopa oprocentowania
        int numberOfInterestRatePerYear; //n określa, ile razy w roku odsetki są doliczane do kapitału
        int numberOfYear; //t to liczba lat

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź wartość zdeponowanej kwoty na koncie: ");
        firstDeposit = keyboard.nextDouble();

        System.out.println("Wprowadź roczną stopę oprocentowania: ");
        annualInterestRate = keyboard.nextByte();
        annualInterestRate = annualInterestRate / 100;

        System.out.println("Wprowadź liczbę ile razy w roku kapitalizowane są odsetki (np. przy kapitalizacji\n" +
                           "miesięcznej wpisz 12, a przy kapitalizacji kwartalnej — 4): ");
        numberOfInterestRatePerYear = keyboard.nextInt();

        System.out.println("Wprowadź liczbę lat przez jakie środki będą znajdować sie na koncie i generować odsetki: ");
        numberOfYear = keyboard.nextInt();

        sumAfterSomeYear = firstDeposit * (1 + (annualInterestRate / numberOfInterestRatePerYear )
                            * (numberOfInterestRatePerYear * numberOfYear));

        System.out.println("Po upływie " + numberOfYear + " na koncie będzie kwota: " + sumAfterSomeYear + " zł.");
    }
}