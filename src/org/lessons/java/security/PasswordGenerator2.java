package org.lessons.java.security;

public class PasswordGenerator2 {

    public static void main(String[] args) {
        
        String userName = "Pinco";
        String userSurname = "Pallo";
        String userColor = "magenta";
        int dayOfBirth = 12;
        int monthOfBirth = 05;
        int yearOfBirth = 1994;

        int sumBirthday = dayOfBirth + monthOfBirth + yearOfBirth;
        String userPassword = userName + "-" + userSurname + "-" + userColor + "-" + sumBirthday;
        System.out.println("La password è: " + userPassword);
    }
}
