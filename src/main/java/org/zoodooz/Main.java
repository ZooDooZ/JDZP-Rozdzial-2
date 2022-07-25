package org.zoodooz;

public class Main {
    public static void main(String[] args) {
        
        double oneAcre = 43560.0;
        double wholeArea = 389767.0;
        double result;

        result = wholeArea / oneAcre;
        System.out.println("Na obszarze zajmującym " + wholeArea + " jest: " + result + " akrów.");
    }
}