package com.masal.sell;

import com.opensymphony.xwork2.ActionSupport;

import java.math.BigDecimal;

/**
 * Created by Yeganeh on 5/29/16.
 */
public class ClassSell extends ActionSupport {
    private String carname;
    private String model;
    private String fuel;
    private String usekilometer;
    private String gearbox;
    private String price;
    private String phonenumber;
    private String explanation;

    public String m1() {
        boolean gearbox1;
        BigDecimal price1;
        int usekilometre1;
        if (carname == null || carname.equals("") || model == null || model.equals("") || fuel == null || fuel.equals("") || usekilometer == null || usekilometer.equals("") || gearbox == null || gearbox.equals("") || price.equals("") || price == null || phonenumber == null || phonenumber.equals("")) {
            addActionError("Fill in all fields!");
            return ERROR;
        }
        if (Integer.parseInt(model) > 2016 && model.length() > 4) {
            addActionError("Wrong number,plase enter 'Model' 4-digit number!");
            return ERROR;
        }
        price1 = new BigDecimal(price);
        if (price1.compareTo(price1.ZERO) <= 0) {
            addActionError("Wrong number for 'Price' plase enter bigest zirro!");
            return ERROR;
        }
        usekilometre1 = Integer.parseInt(usekilometer);
        if (usekilometre1 < 0) {
            addActionError("Wrong number for 'Use kilometer' plase enter bigest zirro number!");
            return ERROR;
        }


        if (gearbox.equals("Manual")) {
            gearbox1 = false;
        }
        if (gearbox.equals("Automatic")) {
            gearbox1 = true;
        }
        if (!(carname == null) || !(model == null) || !(fuel == null) || !usekilometer.equals("") || !(gearbox == "") || !(price == null) || !(phonenumber == null)) {
            addActionMessage("Amaliyat sabt shod!");
        }
        return SUCCESS;
    }


    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
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

    public String getUsekilometer() {
        return usekilometer;
    }

    public void setUsekilometer(String usekilometer) {
        this.usekilometer = usekilometer;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }


}
