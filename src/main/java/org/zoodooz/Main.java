package org.zoodooz;

public class Main {
    public static void main(String[] args) {
        
        String firstName;
        String lastName;
        String middleName;

        char firstInitial;
        char middleInitial;
        char lastInitial;

        firstName = "Filip";
        middleName = "Piotr";
        lastName = "Sokołowski";

        firstInitial = 'F';
        middleInitial = 'P';
        lastInitial = 'S';

        System.out.println(firstInitial + " " + firstName + "\n" + middleInitial + " " + middleName + "\n" +
                            lastInitial + " " + lastName);
    }
}