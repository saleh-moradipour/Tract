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
    public ArrayList registerCar() {
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

}