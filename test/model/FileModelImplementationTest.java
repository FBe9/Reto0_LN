/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the FileModelImplementation class
 * 
 * @author Nerea
 */
public class FileModelImplementationTest {
    
    FileModelImplementation fileModelImplementation = null;
    
    public FileModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        fileModelImplementation = new FileModelImplementation();
        assertEquals("Hello world from the config file",fileModelImplementation.getGreeting());
    }
    
 /**
  * Test the constructor
  */
    @Test
    public void testConstructor() {
        fileModelImplementation = new FileModelImplementation();
        assertNotNull(fileModelImplementation.getGreeting());
        assertTrue(fileModelImplementation instanceof FileModelImplementation);
    }
    
    /**
    * Test that FileModelImplementation is an instance of Model interface
    */
    @Test
    public void testBeingModel() {
        fileModelImplementation = new FileModelImplementation();
        assertTrue(fileModelImplementation instanceof Model);
    }
}
