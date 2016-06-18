package com.masal.sell;

import com.masal.model.Car;
import com.masal.service.CarRegistration;
import com.opensymphony.xwork2.ActionSupport;

import java.math.BigDecimal;

/**
 * Created by Yeganeh on 5/29/16.
 */
public class ClassSell extends ActionSupport {
    private String carName;
    private String model;
    private String fuel;
    private String usedInKilometer;
    private String gearBox;
    private String price;
    private String phoneNumber;
    private String explanation;

    public String m1() {
        BigDecimal price1;
        int usekilometre1;
        if (carName == null || carName.equals("") || model == null || model.equals("") || fuel == null || fuel.equals("") || usedInKilometer == null || usedInKilometer.equals("") || gearBox == null || gearBox.equals("") || price.equals("") || price == null || phoneNumber == null || phoneNumber.equals("")) {
            addActionError("Fill in all fields!");
            return ERROR;
        }
        if (Integer.parseInt(model) > 2016 || Integer.parseInt(model) < 1949 || model.length() > 4) {
            addActionError("The date you entered is incorrect, Please enter the correct date! Or Wrong number plase enter 'Model' 4-digit number!");
            return ERROR;
        }
        price1 = new BigDecimal(price);
        if (price1.compareTo(price1.ZERO) <= 0) {
            addActionError("Wrong number for 'Price' plase enter bigest zirro!");
            return ERROR;
        }
        usekilometre1 = Integer.parseInt(usedInKilometer);
        if (usekilometre1 < 0) {
            addActionError("Wrong number for 'Use kilometer' plase enter bigest zirro number!");
            return ERROR;
        }
        CarRegistration carRegistration = new CarRegistration();
        Car car = new Car();
        car.setCarName(carName);
        car.setModel(Integer.parseInt(model));
        car.setFuel(fuel);
        car.setUsedInKilometer(usekilometre1);
        car.setGearbox(gearBox);
        car.setPrice(price1.longValue());
        car.setPhoneNumber(phoneNumber);
        car.setExplanation(explanation);

        if (carRegistration.registerCar(car)) {
            return SUCCESS;
        }
        return ERROR;
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



