package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    // created scanner class to make it easier to call
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // creates CellPhone objects
        CellPhone JasonsPhone = new CellPhone();
        CellPhone EricsPhone = new CellPhone();

        // sets JasonsPhone
        setPhone(JasonsPhone);

        // displays info for both CellPhones
        display(JasonsPhone);
        display(EricsPhone);

        // have each phone call the other's number using getter
        JasonsPhone.dial(EricsPhone.getPhoneNumber());
        EricsPhone.dial(JasonsPhone.getPhoneNumber());

    }

    // method to simplifying user prompting
    public static String askUser(String prompt) {

        // prints prompt
        System.out.println(prompt);

        // returns a string that is the user input on the next line
        return input.nextLine().trim();

    }

    public static void setPhone(CellPhone phone) {

        // sets CellPhone attributes by using setters and prompting user with method
        System.out.println("Let's set up this phone.");
        phone.setSerialNumber(askUser("What is the serial number?"));
        phone.setModel(askUser("What model is the phone?"));
        phone.setCarrier(askUser("Who is the carrier?"));
        phone.setPhoneNumber(askUser("What is the phone number?"));
        phone.setOwner(askUser("Who is the owner of the phone?"));

    }

    public static void display(CellPhone phone) {

        // prints attributes using getters
        System.out.printf("Info for %s: \n", phone.toString());
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }

}
