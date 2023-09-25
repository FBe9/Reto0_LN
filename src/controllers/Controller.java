/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import interfaces.*;

/**
 * This class is a controller that get the model and the view to show the
 * greeting.
 *
 * @author Nerea
 */
public class Controller {

    public static View view;
    public static Model model;

    /**
     * A contructor of the controller with 2 parameters, each one from a
     * diferent interface.
     *
     * @param view An inteface with the view implementation.
     * @param model An inteface with the model implementation.
     */
    public Controller(View view, Model model) {
        Controller.view = view;
        Controller.model = model;
    }
    
    /**
     * A contructor with no parameters
     */
    public Controller() {
    }

    /**
     * This method shows the greeting taking account the model and the view that
     * it needs.
     */
    public void run() {
        view.showGreeting(model.getGreeting());
    }
}
