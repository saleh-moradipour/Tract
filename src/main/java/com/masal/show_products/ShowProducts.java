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
        carList = carSelection.selectAllCars();
        return SUCCESS;
    }

    int modelOf1;
    int modelUp1;
    int useInKilometerOf1;
    int useInKilometerUp1;
    BigDecimal priceOf1;
    BigDecimal priceUp1;

    public String searchCar() {
        if (carName == null || carName.equals("")) {
            addActionError("Please enter car name");
            return ERROR;
        }
//        in if paeiniye yani karbar meghdare filde modelOf ra vared karde ast va khali nist.
        if (modelOf != null && !modelOf.equals("")) {
            try {
                modelOf1 = Integer.parseInt(modelOf);
            } catch (NumberFormatException e) {
                addActionError("Meghdare filde 'Model From' eshtebah ast.");
            }
        }
        if (modelUp != null && !modelUp.equals("")) {
            try {
                modelUp1 = Integer.parseInt(modelUp);
            } catch (NumberFormatException e) {
                addActionError("Meghdare filde 'Model To' eshtebah ast.");
            }
        }
        if (modelOf != null && !modelOf.equals("") && modelUp != null && !modelUp.equals("")) {
            if (modelOf1 > modelUp1) {
                addActionError("Error,'From Model' Smaller is 'To Model'.");
                return ERROR;
            }
            if (modelUp.length() > 4 || modelOf.length() > 4) {
                addActionError("Error ,lenght 'Model Of' or 'Model Up'.");
                return ERROR;
            }
            if (modelOf1 < 1949) {
                addActionError("Error,'From Model' fewer 1949.");
                return ERROR;
            }
            if (modelUp1 > 2016) {
                addActionError("Error,'To Model' more 2016.");
                return ERROR;
            }
        }
        if (priceOf != null && !priceOf.equals("")) {
            try {
                priceOf1 = new BigDecimal(priceOf);
            } catch (Exception e) {
                addActionError("Meghdare filde 'Price From' eshtebah ast.");
                return ERROR;
            }
        }
        if (priceUp != null && !priceUp.equals("")) {
            try {
                priceUp1 = new BigDecimal(priceUp);
            } catch (Exception e) {
                addActionError("Meghdare filde 'Price To' eshtebah ast.");
                return ERROR;
            }
        }
        if (priceOf != null && !priceOf.equals("") && priceUp != null && !priceUp.equals("")) {
            if (priceOf1.compareTo(priceUp1) > 0) {
                addActionError("Error,'Price From' Smaller is 'Price To'.");
                return ERROR;
            }
        }
        if (usedInKilometerOf != null && !usedInKilometerOf.equals("")) {
            try {
                useInKilometerOf1 = Integer.parseInt(usedInKilometerOf);
            } catch (NumberFormatException e) {
                addActionError("Meghdar 'Use In Kilometer From' eshtebah ast.");
                return ERROR;
            }
        }
        if (usedInKilometerUp != null && !usedInKilometerUp.equals("")) {
            try {
                useInKilometerUp1 = Integer.parseInt(usedInKilometerUp);
            } catch (NumberFormatException e) {
                addActionError("Meghdar 'Use In Kilometer To' eshtebah ast.");
                return ERROR;
            }
        }
        if (usedInKilometerOf != null && !usedInKilometerOf.equals("") && usedInKilometerUp != null && !usedInKilometerUp.equals("")) {
            if (useInKilometerOf1 > useInKilometerUp1) {
                addActionError("Error,'Use In Kilometer From' Smaller is 'Use In Kilometer To'.");
                return ERROR;
            }
        }
        CarSelection carSelection = new CarSelection();
        carList = carSelection.selectCustomCars(carName, modelOf, modelUp, priceOf, priceUp, usedInKilometerOf, usedInKilometerUp, explanation);
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
