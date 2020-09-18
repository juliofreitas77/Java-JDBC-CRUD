package com.estudos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_jdbc" + "?useTimezone=true&serverTimezone=America/Sao_Paulo",
                    "root", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
