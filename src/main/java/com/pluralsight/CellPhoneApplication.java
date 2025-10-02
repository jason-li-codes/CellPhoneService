package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone JasonsPhone = new CellPhone();

        JasonsPhone.setSerialNumber(askUser("What is the serial number?"));
        JasonsPhone.setModel(askUser("What model is the phone?"));
        JasonsPhone.setCarrier(askUser("Who is the carrier?"));
        JasonsPhone.setPhoneNumber(askUser("What is the phone number?"));
        JasonsPhone.setOwner(askUser("Who is the owner of the phone?"));

        System.out.println(JasonsPhone.getSerialNumber());
        System.out.println(JasonsPhone.getModel());
        System.out.println(JasonsPhone.getCarrier());
        System.out.println(JasonsPhone.getPhoneNumber());
        System.out.println(JasonsPhone.getOwner());

    }

    public static String askUser(String prompt) {

        System.out.println(prompt);
        return input.nextLine().trim();

    }

}
