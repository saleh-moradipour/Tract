package com.masal.register;

import com.masal.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Yeganeh on 6/17/16.
 */
public class PersonRegister {

    public Boolean register(Person person) {
        int id = -1;
        String sql = "INSERT INTO PERSON(name,lastname,password,phone_number,address) values (?,?,?,?,?)";
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        Connection connection = connectionManager.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setInt(3, Integer.parseInt(person.getPass()));
            preparedStatement.setInt(4, Integer.parseInt(person.getPhone_Number()));
            preparedStatement.setString(5, person.getAddress());
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
