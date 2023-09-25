/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import exceptions.ConfigFileBadWriteException;
import interfaces.View;
import java.util.ResourceBundle;
import view.JavaFXViewImplementation;
import view.TextViewImplementation;

/**
 * ModelFactory is a Factory that gives the view implementation that is need taking account the config file.
 *
 * @author Leire
 */
public class ViewFactory {

    //View Interface.
    private static View view;
    //Text from de config file to specify the view type.
     private final String VIEW = ResourceBundle.getBundle("model.config").getString("VIEW");

    /**
     * This method returs the implementation from de view that is need accordig
     * to the config file.
     *
     * @throws exceptions.ConfigFileBadWriteException Throws an error that tells
     * the client that the config file's parameter is wrong.
     * @return The implementation from the view.
     */
    public View getView() throws ConfigFileBadWriteException {
        if (VIEW.equalsIgnoreCase("WINDOW")) {
            view = new JavaFXViewImplementation();
        } else if (VIEW.equalsIgnoreCase("TXT")) {
            view = new TextViewImplementation();
        } else {
            throw new ConfigFileBadWriteException("The text that appears in the configuration file of the requested parameter is not a valid value.");
        }
        return view;
    }
}
