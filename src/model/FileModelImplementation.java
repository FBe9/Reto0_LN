/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Model;
import java.util.ResourceBundle;

/**
 * This class is an implementation from the Model interface using a property file. 
 * 
 * @author Nerea
 */
public class FileModelImplementation implements Model {

    //Get the message from the property file
    private static final String MSG = ResourceBundle.getBundle("model.config").getString("MSG");

    /**
     *
     * @return A String with the message from the property file
     */
    @Override
    public String getGreeting() {
        return MSG;
    }
}
