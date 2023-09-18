/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * This class makes the connection with the DB.
 * 
 * @author Leire
 */
public class ModelDBConnection {

    protected Connection con;
    protected PreparedStatement stmt;
    protected ResultSet rs;

    // Access to the configuration file.
    protected static ResourceBundle config = ResourceBundle.getBundle("model.config.parameters");
    protected String //db = configFile.getString("DB"),
            url = config.getString("Connection"),
            user = config.getString("DBUser"),
            pass = config.getString("DBPasswd");

    protected void openConnection() {
        con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
        }
    }

    protected void closeConnection() {
        try {
            if (stmt != null) {
                stmt.close();
            }

            if (con != null) {
                con.close();
            }
        } catch (SQLException sqle) {
        }
    }
}
