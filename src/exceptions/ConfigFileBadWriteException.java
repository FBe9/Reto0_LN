/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Nerea
 */
public class ConfigFileBadWriteException extends Exception {

    /**
     * Creates a new instance of <code>ConfigFileBadWriteException</code>
     * without detail message.
     */
    public ConfigFileBadWriteException() {
    }

    /**
     * Constructs an instance of <code>ConfigFileBadWriteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ConfigFileBadWriteException(String msg) {
        super("The text that appears in the configuration file of the requested parameter is not a valid value");
    }
}
