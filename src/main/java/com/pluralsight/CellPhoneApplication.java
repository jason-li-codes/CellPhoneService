package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    // created scanner class to make it easier to call
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // creates a CellPhone object called JasonsPhone
        CellPhone JasonsPhone = new CellPhone();

        // sets CellPhone attributes by using setters and prompting user with method
        JasonsPhone.setSerialNumber(askUser("What is the serial number?"));
        JasonsPhone.setModel(askUser("What model is the phone?"));
        JasonsPhone.setCarrier(askUser("Who is the carrier?"));
        JasonsPhone.setPhoneNumber(askUser("What is the phone number?"));
        JasonsPhone.setOwner(askUser("Who is the owner of the phone?"));

        // prints attributes using getters
        System.out.println(JasonsPhone.getSerialNumber());
        System.out.println(JasonsPhone.getModel());
        System.out.println(JasonsPhone.getCarrier());
        System.out.println(JasonsPhone.getPhoneNumber());
        System.out.println(JasonsPhone.getOwner());

    }

    // method to simplifying user prompting
    public static String askUser(String prompt) {

        // prints prompt
        System.out.println(prompt);

        // returns a string that is the user input on the next line
        return input.nextLine().trim();

    }

}
