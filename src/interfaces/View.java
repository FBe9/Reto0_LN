/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * View is an Interface.
 * 
 * @author Leire
 */
public interface View {

    /**
     * This method shows a string from Window or Terminal depending to the implementation .
     * 
     * @param greeting Is a String with the message.
     */
    public void showGreeting(String greeting);

}

