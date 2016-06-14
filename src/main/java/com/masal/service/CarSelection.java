package com.masal.service;

import com.masal.ConnectionManager;
import com.masal.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Yeganeh on 6/7/16.
 */
public class CarSelection {
    public ArrayList selectAllCars() {
        int id = 1;
        ArrayList list = new ArrayList();
        String sql = "SELECT name, model, fuel,used_in_kilometer, gearbox, price, phone_number, description FROM CAR";
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        Connection connection = connectionManager.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Car car = new Car();
                String name = resultSet.getString("name");
                int model = resultSet.getInt("model");
                String fuel = resultSet.getString("fuel");
                int used_in_kilometer = resultSet.getInt("used_in_kilometer");
                String gearbox = resultSet.getString("gearbox");
                long price = resultSet.getLong("price");
                String phone_number = resultSet.getString("phone_number");
                String explanation = resultSet.getString("description");
                car.setCarName(name);
                car.setModel(model);
                car.setFuel(fuel);
                car.setUsedInKilometer(used_in_kilometer);
                car.setGearbox(gearbox);
                car.setPrice(price);
                car.setPhoneNumber(phone_number);
                car.setExplanation(explanation);
                list.add(car);
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public ArrayList selectCustomCars(String carName, String modelOf, String modelUp, String priceOf, String priceUp, String usedInKilometerOf, String usedInKilometerUp, String explanation) {
        ArrayList list = new ArrayList();
        String sql = "SELECT name, model, fuel,used_in_kilometer, gearbox, price, phone_number, description FROM CAR where name=\"" + carName + "\"";
        if (modelOf != null && !modelOf.equals("")) {
            sql = sql + " and model > " + modelOf;
        }
        if (modelUp != null && !modelUp.equals("")) {
            sql = sql + " and model< " + modelUp;
        }
        if (priceOf != null && !priceOf.equals("")) {
            sql = sql + " and price> " + priceOf;
        }
        if (priceUp != null && !priceOf.equals("")) {
            sql = sql + " and price< " + priceUp;
        }
        if (usedInKilometerOf != null && !usedInKilometerOf.equals("")) {
            sql = sql + " and used_in_kilometer >" + usedInKilometerOf;
        }
        if (usedInKilometerUp != null && !usedInKilometerUp.equals("")) {
            sql = sql + " and used_in_kilometer< " + usedInKilometerUp;
        }
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        Connection connection = connectionManager.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Car car1 = new Car();
                String name = resultSet.getString("name");
                int model = resultSet.getInt("model");
                String fuel = resultSet.getString("fuel");
                int used_in_kilometer = resultSet.getInt("used_in_kilometer");
                String gearbox = resultSet.getString("gearbox");
                long price = resultSet.getLong("price");
                String phone_number = resultSet.getString("phone_number");
                explanation = resultSet.getString("description");
                car1.setCarName(name);
                car1.setModel(model);
                car1.setFuel(fuel);
                car1.setUsedInKilometer(used_in_kilometer);
                car1.setGearbox(gearbox);
                car1.setPrice(price);
                car1.setPhoneNumber(phone_number);
                car1.setExplanation(explanation);
                list.add(car1);
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

}