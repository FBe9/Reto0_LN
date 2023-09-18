/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Model is an interface.
 * 
 * @author Nerea
 */
public interface Model {

    /**
     * This method returns a string from de Database or File depending to the implementation.
     *
     * @return A String with the message.
     */
    public String getGreeting();

}