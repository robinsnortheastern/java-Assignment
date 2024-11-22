/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package facad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class FacadTest {
    
    public FacadTest() {
    }
    

    /**
     * Test of drawCircle method, of class Facad.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle TESTED SUCCESSFULLY");
        Facad instance = new Facad();
        //instance.drawCircle();
        String expResult = "Circle: draw()";
        String result = instance.drawCircle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        
        //positive test cases
        assertEquals(expResult,result);
        assertEquals("Circle: draw()", instance.drawCircle());
        
        //negative test cases
        
        assertNotEquals("Not Circle", instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());
    }

    /**
     * Test of drawRectangle method, of class Facad.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        Facad instance = new Facad();
      //  instance.drawRectangle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expResult = "Rectangle: draw()";
        String result = instance.drawRectangle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        
        //positive test cases
        assertEquals(expResult,result);
        assertEquals("Rectangle: draw()", instance.drawRectangle());
        
        //negative test cases
        
        assertNotEquals("Not Rectangle", instance.drawRectangle());
        assertNotEquals("Square", instance.drawRectangle());
    }

    /**
     * Test of drawSquare method, of class Facad.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        Facad instance = new Facad();
        //instance.drawSquare();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        String expResult = "Square: draw()";
        String result = instance.drawSquare();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        
        //positive test cases
        assertEquals(expResult,result);
        assertEquals("Square: draw()", instance.drawSquare());
        
        //negative test cases
        
        assertNotEquals("Not Square", instance.drawSquare());
        assertNotEquals("Circle", instance.drawSquare());
    }
    
}
