package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Inserisci il nome e premi invio");
        String userInputName = input.nextLine();

        System.out.println("Inserisci il cognome e premi invio");
        String userInputSurname = input.nextLine();

        System.out.println("Inserisci il colore preferito e premi invio");
        String favouriteColor = input.nextLine();

        System.out.println("Inserisci il giorno di nascita e premi invio");
        int inputDayOfBirth = Integer.parseInt(input.nextLine());

        System.out.println("Inserisci il mese di nascita e premi invio");
        int inputMonthOfBirth = Integer.parseInt(input.nextLine());
        
        System.out.println("Inserisci l'anno di nascita e premi invio");
        int inputYearOfBirth = Integer.parseInt(input.nextLine());

        int sumUserDate = inputDayOfBirth + inputMonthOfBirth + inputYearOfBirth;
        String userPasswordGenerated = userInputName + "-" + userInputSurname + "-" + favouriteColor + "-" + sumUserDate;
        System.out.println("La password è: " + userPasswordGenerated);




        input.close();
    }

}
