/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import exceptions.ConfigFileBadWriteException;
import interfaces.Model;
import java.util.ResourceBundle;
import model.DBModelImplementation;
import model.FileModelImplementation;

/**
 * ModelFactory is a Factory that gives the model implementation that is need
 * taking account the config file.
 *
 * @author Nerea
 */
public class ModelFactory {

    //View Interface.
    private static Model model;
    //Text from de config file to specify the model type.
    private static final String MODEL = ResourceBundle.getBundle("model.config").getString("MODEL");

    /**
     * This method returs the implementation from de model that is need accordig
     * to the config file.
     *
     * @throws exceptions.ConfigFileBadWriteException Throws an error that tells
     * the client that the config file's parameter is wrong.
     * @return The implementation from the model.
     */
    public Model getModel() throws ConfigFileBadWriteException {
        if (MODEL.equalsIgnoreCase("FILE")) {
            model = new FileModelImplementation();
        } else if (MODEL.equalsIgnoreCase("DB")) {
            model = new DBModelImplementation();
        } else {
            throw new ConfigFileBadWriteException("The text that appears in the configuration file of the requested parameter is not a valid value.");
        }
        return model;
    }
}
