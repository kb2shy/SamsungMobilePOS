package com.chhaianpin.samsungmobilepos;

public class Item {

    private String name;
    private double price;
    private String serialNumber;
    private int quantity;
    private double amount;

    public Item(String name, double price, String serialNumber, int quantity) {
        this.name = name;
        this.price = price;
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        amount = getAmount();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    private double getAmount(){
        return this.price * this.quantity;
    }
}
