/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.AfterSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Panda
 */
public class GoodDatabaseConnection {

    private static GoodDatabaseConnection instance;
    private Connection connection;

    private String url;
    private String user;
    private String password;

    private GoodDatabaseConnection(String url, String user, String password) {
        try {
            this.url = url;
            this.user = user;
            this.password = password;

            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connection to the database", ex);
        }

    }

    public static GoodDatabaseConnection getInstance(String url, String user, String password) {
        if (instance == null) {
            instance = new GoodDatabaseConnection(url, user, password);
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
