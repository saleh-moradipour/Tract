package com.masal.show_products;

import com.masal.service.CarSelection;
import com.opensymphony.xwork2.ActionSupport;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Yeganeh on 6/7/16.
 */
public class ShowProducts extends ActionSupport {
    private ArrayList carList;
    private String carName;
    private String modelOf;
    private String modelUp;
    private String fuel;
    private String usedInKilometerOf;
    private String usedInKilometerUp;
    private String gearBox;
    private String priceOf;
    private String priceUp;
    private String phoneNumber;
    private String explanation;

    public String selFrom() {
        CarSelection carSelection = new CarSelection();
        carList = carSelection.registerCar();
        return SUCCESS;
    }

    int modelOf1 = -1;
    int modelUp1 = -1;
    int useInKilometerOf1 = -1;
    int useInKilometerUp1 = -1;
    BigDecimal priceOf1 = new BigDecimal(-1);
    BigDecimal priceUp1 = new BigDecimal(-1);

    public String searchCar() {
        if (carName == null || carName.equals("")) {
            addActionError("Plase enter car name");
            return ERROR;
        }
        if (modelOf == null || modelOf.equals("") || modelUp == null || modelUp.equals("") || fuel == null || fuel.equals("") || usedInKilometerOf == null || usedInKilometerOf.equals("") || usedInKilometerUp == null || usedInKilometerUp.equals("") || gearBox == null || gearBox.equals("") || priceOf == null || priceOf.equals("")) {
            return SUCCESS;
        }
        if (modelOf1 > modelUp1) {
            addActionError("Error,'From Model' Small 'To Model'.");
            return ERROR;
        }
        if (modelUp.length() > 4 || modelOf.length() > 4) {
            addActionError("Error ,lenght 'Model Of' or 'Model Up'.");
            return ERROR;
        }
        try {
            modelOf1 = Integer.parseInt(modelOf);
        } catch (NumberFormatException e) {
            addActionError("Error,From Model");
            return ERROR;
        }
        try {
            modelUp1 = Integer.parseInt(modelUp);
        } catch (NumberFormatException e) {
            addActionError("Error,To Model");
            return ERROR;
        }
        if (modelOf1 < 1949) {
            addActionError("Error,'From Model.");
            return ERROR;
        }
        if (modelUp1 > 2016) {
            addActionError("Error,'To Model'.");
            return ERROR;
        }
        if (priceOf1.compareTo(priceUp1) > priceUp1.compareTo(priceOf1)) {
            addActionError("Error,'From price' Small 'To price'.");
            return ERROR;
        }
        try {
            priceOf1 = new BigDecimal(priceOf);
        } catch (NumberFormatException e) {
            addActionError("Error,From Price");
            return ERROR;
        }
        try {
            priceUp1 = new BigDecimal(priceUp);
        } catch (NumberFormatException e) {
            addActionError("Error,To Price");
            return ERROR;
        }
        if (useInKilometerOf1 > useInKilometerUp1) {
            addActionError("Error,'From Use In Kilometer' Small 'To Use In Kilometer'.");
            return ERROR;
        }
        try {
            useInKilometerOf1 = Integer.parseInt(usedInKilometerOf);
        } catch (NumberFormatException e) {
            addActionError("Error,From Use In Kilometer");
            return ERROR;
        }
        try {
            useInKilometerUp1 = Integer.parseInt(usedInKilometerUp);
        } catch (NumberFormatException e) {
            addActionError("Error,To" +
                    " Use In Kilometer");
            return ERROR;
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

    public String getModelOf() {
        return modelOf;
    }

    public void setModelOf(String modelOf) {
        this.modelOf = modelOf;
    }

    public String getModelUp() {
        return modelUp;
    }

    public void setModelUp(String modelUp) {
        this.modelUp = modelUp;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getUsedInKilometerOf() {
        return usedInKilometerOf;
    }

    public void setUsedInKilometerOf(String usedInKilometerOf) {
        this.usedInKilometerOf = usedInKilometerOf;
    }

    public String getUsedInKilometerUp() {
        return usedInKilometerUp;
    }

    public void setUsedInKilometerUp(String usedInKilometerUp) {
        this.usedInKilometerUp = usedInKilometerUp;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public String getPriceOf() {
        return priceOf;
    }

    public void setPriceOf(String priceOf) {
        this.priceOf = priceOf;
    }

    public String getPriceUp() {
        return priceUp;
    }

    public void setPriceUp(String priceUp) {
        this.priceUp = priceUp;
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
