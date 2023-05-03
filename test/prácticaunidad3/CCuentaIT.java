/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

import junit.framework.TestCase;

/**
 *
 * @author Maxi
 */
public class CCuentaIT extends TestCase {
    
    public CCuentaIT(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setNombre method, of class CCuenta.
     */
    public void testSetNombre() {
        System.out.println("setNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.setNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CCuenta.
     */
    public void testGetNombre() {
        System.out.println("getNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CCuenta.
     */
    public void testGetEstado() {
        System.out.println("getEstado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.getEstado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.ingresar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class CCuenta.
     */
    public void testGetCuenta() {
        System.out.println("getCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
