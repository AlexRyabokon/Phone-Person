package org.example;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }


    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    String receiveCall(String nameOfCaller){
        return  "Звонит " + nameOfCaller + ", его телефон: " + getNumber();
    }

    String receiveCall(String nameOfCaller, int numberOfCaller){
        return "Звонит " + nameOfCaller + ", его телефон: " + numberOfCaller;
    }

    void sendMessage(int numberForSMS){
        System.out.println("Send SMS to phone number -- >  "+numberForSMS);
    }


}
