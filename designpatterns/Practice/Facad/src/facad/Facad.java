/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facad;

/**
 * The Facade Class simplifies the interaction with different Shape objects
 * by providing methods, to draw a Circle, Square or Rectangle.
 * It acts as a single Interface to these subsystems.
 * @author admin
 */
public class Facad {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    
    /**
     * Initializes the Facad class and creates instances of Circle, Rectangle and Square.
     * These objects are used to delegate  the drawing operations.
     */
    public Facad(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    
    /**
     * Draw a circle by delegating  the call  to the Circle object.
     * 
     * @return a string message indicating the Circle  has been drawn.
     */
    public String drawCircle(){
        circle.draw();
        return "Circle: draw()";
       
    }
    
    /**
     * Draw a rectangle by delegating  the call  to the Rectangle object.
     * @return a string message indicating the Rectangle  has been drawn.
     */
        public String drawRectangle(){
         rectangle.draw();
         return "Rectangle: draw()";
    }
        
        /**
         * Draw a rectangle by delegating  the call  to the Rectangle object.
         * @return a string message indicating the Rectangle  has been drawn.
         */
        public String drawSquare(){
         square.draw();
         return "Square: draw()";
    }
}
