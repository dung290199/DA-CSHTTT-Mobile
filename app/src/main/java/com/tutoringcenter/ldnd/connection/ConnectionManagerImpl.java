/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.tutoringcenter.ldnd.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author ADMIN
 */
public class ConnectionManagerImpl implements ConnectionManager {

    @Override
    public Connection getConnection() {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "billeeloan21980108");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
