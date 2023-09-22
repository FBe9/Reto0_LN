/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.View;

/**
 * This class is an implementation from the View interface using a 
 * System.out.println().
 *
 * @author Leire
 */
public class TextViewImplementation implements View {

    /**
     * This method shows the greeting from the config file.
     *
     * @param greeting A string with the messages from the config file.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
