/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dayvison
 */
public class ConectarBDTest {
    
    public ConectarBDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Iniciar method, of class ConectarBD.
     */
    @Test
    public void testIniciar() throws Exception {
        System.out.println("Iniciar");
        ConectarBD.Iniciar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarConexao method, of class ConectarBD.
     */
    @Test
    public void testCriarConexao() throws Exception {
        System.out.println("criarConexao");
        Connection expResult = null;
        Connection result = ConectarBD.criarConexao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
