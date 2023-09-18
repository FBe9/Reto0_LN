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
import java.util.logging.Logger;

/**
 * This class makes the connection with the DB.
 * 
 * @author Leire
 */
public class ModelDBConnection {

    protected Connection con;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    private static final Logger LOGGER = Logger.getLogger("package model.ModelDBConnection");

    // Access to the configuration file.
    protected static ResourceBundle config = ResourceBundle.getBundle("model.config");
    protected String //db = configFile.getString("DB"),
            url = config.getString("Connection"),
            user = config.getString("DBUser"),
            pass = config.getString("DBPasswd");

    protected void openConnection() {
        con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            LOGGER.severe("Error opening the connection with the db");
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
        } catch (SQLException e) {
            LOGGER.severe("Error closing the connection with the db");
        }
    }
}
