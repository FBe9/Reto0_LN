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
 *
 * @author Leire
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewFactory view = new ViewFactory();
        ModelFactory model = new ModelFactory();

        try {
            new Controller(view.getView(), model.getModel()).run();
        } catch (ConfigFileBadWriteException ex) {
            Logger.getLogger(application.Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
