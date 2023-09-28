/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Model;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class test the DBModelImplementation class.
 *
 * @author Leire
 */
public class DBModelImplementationTest {

    DBModelImplementation dbm = null;
    private static final ResourceBundle CONFIG = ResourceBundle.getBundle("model.config");

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

    /**
     * Test that what happens if the config file is not right
     */
    @Test(expected = org.junit.ComparisonFailure.class)
    public void testFileNotRightWrite() {
        dbm = new DBModelImplementation();
        String model = CONFIG.getString("MODEL");
        assertEquals("DB", model);
    }

    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test(expected = org.junit.ComparisonFailure.class)
    public void testNotRightGreeting() {
        dbm = new DBModelImplementation();
        assertEquals("Hello world from the config file", dbm.getGreeting());
    }
}
