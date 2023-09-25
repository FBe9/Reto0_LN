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
 * This class test the DBModelImplementation class.
 *
 * @author Leire
 */
public class DBModelImplementationTest {

    DBModelImplementation dbm = null;

    public DBModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class DBModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        dbm = new DBModelImplementation();
        assertEquals("Hello world from the DB", dbm.getGreeting());
    }

    /**
     * Test the constructor
     */
    @Test
    public void testConstructor() {
        dbm = new DBModelImplementation();
        assertNotNull(dbm.getGreeting());
        assertTrue(dbm instanceof DBModelImplementation);
    }

    /**
     * Test that DBModelImplementation is an instance of Model interface
     */
    @Test
    public void testBeingModel() {
        dbm = new DBModelImplementation();
        assertTrue(dbm instanceof Model);
    }

}
