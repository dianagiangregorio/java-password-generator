package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Inserisci il nome e premi invio");
        String userName = input.nextLine();

        System.out.println("Inserisci il cognome e premi invio");
        String userSurname = input.nextLine();

        System.out.println("Inserisci il colore preferito e premi invio");
        String favouriteColor = input.nextLine();

        System.out.println("Inserisci il giorno di nascita e premi invio");
        int dayOfBirth = Integer.parseInt(input.nextLine());

        System.out.println("Inserisci il mese di nascita e premi invio");
        int monthOfBirth = Integer.parseInt(input.nextLine());
        
        System.out.println("Inserisci l'anno di nascita e premi invio");
        int yearOfBirth = Integer.parseInt(input.nextLine());

        int sumBirthday = dayOfBirth + monthOfBirth + yearOfBirth;
        String userPassword = userName + "-" + userSurname + "-" + favouriteColor + "-" + sumBirthday;
        System.out.println("La password è: " + userPassword);




        input.close();
    }

}
