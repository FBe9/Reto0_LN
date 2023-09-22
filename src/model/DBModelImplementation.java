/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Model;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is an implementation from the Model interface using a data base.
 *
 * @author Leire
 */
public class DBModelImplementation extends ModelDBConnection implements Model {

  private static final String SEARCHGREETING = "SELECT greeting FROM greeting";
    /**
     * 
     * @return 
     */
    @Override
    public String getGreeting() {
        String resultado = null;
            try {
                openConnection();
                stmt = con.prepareStatement(SEARCHGREETING);
                rs = stmt.executeQuery();
                rs.next();
               resultado = rs.getString(1);
                
            } catch (SQLException ex) {
                Logger.getLogger(DBModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                closeConnection();
            }
        
        return resultado;
    }
}
