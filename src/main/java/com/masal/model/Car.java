package com.masal.model;

/**
 * Created by Yeganeh on 6/1/16.
 */
public class Car {
    private String carName;
    private int model;
    private String fuel;
    private int usedInKilometer;
    private String gearbox;
    private long price;
    private String phoneNumber;
    private String explanation;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getUsedInKilometer() {
        return usedInKilometer;
    }

    public void setUsedInKilometer(int usedInKilometer) {
        this.usedInKilometer = usedInKilometer;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
