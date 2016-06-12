package com.masal.show_products;

import com.masal.service.CarSelection;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;

/**
 * Created by Yeganeh on 6/7/16.
 */
public class ShowProducts extends ActionSupport {
    private ArrayList carList;
    private String carName;
    private String model;
    private String fuel;
    private String usedInKilometer;
    private String gearBox;
    private String price;
    private String phoneNumber;
    private String explanation;

    public String selFrom() {
        CarSelection carSelection = new CarSelection();
        carList = carSelection.registerCar();
        return SUCCESS;
    }

    public String searchCar() {
        if (carName == null || carName.equals("")) {
            addActionError("Plase enter car name");
        }
        return SUCCESS;
    }

    public ArrayList getCarList() {
        return carList;
    }

    public void setCarList(ArrayList carList) {
        this.carList = carList;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getUsedInKilometer() {
        return usedInKilometer;
    }

    public void setUsedInKilometer(String usedInKilometer) {
        this.usedInKilometer = usedInKilometer;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
