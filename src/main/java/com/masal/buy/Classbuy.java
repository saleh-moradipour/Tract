package com.masal.buy;

import com.opensymphony.xwork2.ActionSupport;

import java.math.BigDecimal;

/**
 * Created by Yeganeh on 5/31/16.
 */
public class ClassBuy extends ActionSupport {
    private String carName;
    private String modelOf;
    private String modelUp;
    private String usekilometerOf;
    private String usekilometerUp;
    private String priceOf;
    private String priceUp;


    public String buyBuy() {
        int modelOf1;
        int modelUp1;
        int usekilometerOf1;
        int usekilometerUp1;
        BigDecimal priceOf1;
        BigDecimal priceUp1;

        if (carName == null || carName.equals("")) {
            addActionError("Be sure to choose the car name");
            return ERROR;
        }
        if (modelOf.length() > 4) {
            addActionError("Wrong number,plase enter 'Model' 4-digit number!");
            return ERROR;
        }
        if (modelUp.length() > 4) {
            addActionError("Wrong number,plase enter 'Model' 4-digit number!");
            return ERROR;
        }
//        modelOf1=Integer.parseInt(modelOf);
//        if ( modelOf1< 1949) {
//            addActionError("Date wrong plase change Model!");
//            return ERROR;
//        }
//        modelUp1=Integer.parseInt(modelUp);
//        if (modelUp1 > 2016) {
//            addActionError("Date wrong plase change Model!");
//            return ERROR;




//        }
        usekilometerOf1 = Integer.parseInt(usekilometerOf);
        if (usekilometerOf1 < 0) {
            addActionError("Wrong number for 'Use kilometer' plase enter bigest zirro number!");
            return ERROR;
        }
        usekilometerUp1 = Integer.parseInt(usekilometerUp);
        if (usekilometerUp1 < 0) {
            addActionError("Wrong number for 'Use kilometer' plase enter bigest zirro number!");
            return ERROR;
        }
//        priceOf1= new BigDecimal(priceOf);
//        if (priceOf1.compareTo(priceOf1.ZERO) <= 0) {
//            addActionError("Wrong number for 'Price Of' plase enter bigest zirro!");
//            return ERROR;
//        }
//        priceUp1 = new BigDecimal(priceUp);
//        if (priceUp1.compareTo(priceUp1.ZERO)<=0) {
//            addActionError("Wrong number for 'Price Up' plase enter bigest zirro!");
//            return ERROR;
//        }
        if (!(carName == null) || !(carName.equals(""))) {
            addActionMessage("Searching please wait.");
        }
        return SUCCESS;
    }

    public String getUsekilometerUp() {
        return usekilometerUp;
    }

    public void setUsekilometerUp(String usekilometerUp) {
        this.usekilometerUp = usekilometerUp;
    }

    public String getUsekilometerOf() {
        return usekilometerOf;
    }

    public void setUsekilometerOf(String usekilometerOf) {
        this.usekilometerOf = usekilometerOf;
    }

    public String getModelUp() {
        return modelUp;
    }

    public void setModelUp(String modelUp) {
        this.modelUp = modelUp;
    }

    public String getModelOf() {
        return modelOf;
    }

    public void setModelOf(String modelOf) {
        this.modelOf = modelOf;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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
}