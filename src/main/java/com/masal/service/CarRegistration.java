package com.masal.service;

import com.masal.ConnectionManager;
import com.masal.model.Car;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author: Masoud
 * Date: 6/1/16
 * Time: 7:06 PM
 */
public class CarRegistration {

    public boolean registerCar(Car car) {
        int id = -1;
        String sql = "INSERT INTO CAR(name, model, fuel, used_in_kilometer, gearbox, price, phone_number, description) values(?,?,?,?,?,?,?,?)";
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        Connection connection = connectionManager.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, car.getCarName());
            preparedStatement.setInt(2, car.getModel());
            preparedStatement.setString(3, car.getFuel());
            preparedStatement.setInt(4, car.getUsedInKilometer());
            preparedStatement.setString(5, car.getGearbox());
            preparedStatement.setBigDecimal(6, new BigDecimal(car.getPrice()));
            preparedStatement.setString(7, car.getPhoneNumber());
            preparedStatement.setString(8, car.getExplanation());
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            id = resultSet.getInt(1);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id != -1;
    }
}