package org.zoodooz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Wprowadz swoje imie: ");
        String age = JOptionPane.showInputDialog("Wprowadz swoj wiek: ");
        String townName = JOptionPane.showInputDialog("Wprowadz swoja nazwe miejscowosci: ");
        String universityName = JOptionPane.showInputDialog("Wprowadz swoja nazwe uczelni: ");
        String profession = JOptionPane.showInputDialog("Wprowadz swoj zawod: ");
        String typeOfAnimal = JOptionPane.showInputDialog("Wprowadz gatunek zwierzecia: ");
        String animalName = JOptionPane.showInputDialog("Wprowadz imię zwierzecia: ");

        System.out.println("Pewnego razu żył sobie " + name + ", który mieszkał w " + townName + ".\nW wieku " +
                           age + " " + name + " rozpoczął studia na " + universityName + ". \n" + name +
                            " ukończył studia i rozpoczął pracę jako " + profession + ". " + "\nWtedy " + name +
                            " adoptował " + typeOfAnimal + " o imieniu " + animalName + "\ni żyli razem długo i szczęśliwie!");
    }
}