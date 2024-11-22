/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facad;

/**
 *
 * @author admin
 */
public class FacadPatternDemo {
    
    /**
     * The main method demonstrates how to use the Facad class  to draw a Circle, Rectangle and Square
     * without interacting with their individual implementations.
     * @param args the command-line arguments
     */

    
    public static void main(String[] args) {
        Facad shapemaker = new Facad();
        
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
    
}
