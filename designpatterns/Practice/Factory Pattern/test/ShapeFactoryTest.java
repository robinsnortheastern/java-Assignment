/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author admin
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        System.out.println("Got shapes like Circle, Rectangle and Square...");
       
       
        ShapeFactory factory = new ShapeFactory();
        
        Shape circle = factory.getShape("Circle");
        
        assertNotNull(circle);
        //org.junit.Assert.assertTrue(message, true);
        
        assertTrue(circle instanceof Circle);
        //System.out.println
        
        Shape rectangle = factory.getShape("Rectangle");
        
        assertNotNull(rectangle);
        
        assertTrue(rectangle instanceof Rectangle);
        
        
        Shape square = factory.getShape("Square");
        
        assertNotNull(square);
        
        assertTrue(square instanceof Square);
        
        
    }
    
}
