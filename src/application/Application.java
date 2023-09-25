/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controllers.Controller;
import exceptions.ConfigFileBadWriteException;
import factories.ModelFactory;
import factories.ViewFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the Application class of the app.
 *
 * @author Leire
 */
public class Application {

    /**
     * This method creates a controller giving the parameters to create it, the
     * model and the view that it will use to show the greeting.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewFactory viewF = new ViewFactory();
        ModelFactory modelF = new ModelFactory();

        try {
            new Controller(viewF.getView(), modelF.getModel()).run();
        } catch (ConfigFileBadWriteException ex) {
            Logger.getLogger(application.Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
