package com.pluralsight;

public class CellPhone {

    // declares variables to be used in formatting the class
    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // parameterless constructor with default values
    public CellPhone() {
        this.serialNumber = "0";
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // getter and setter for serialNumber

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // getter and setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // getter and setter for carrier
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    // getter and setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter and setter for owner
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String otherNumber) {
        System.out.printf("%s's phone is calling %s.", owner, otherNumber);
    }
}
