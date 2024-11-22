/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */




/**
 * This class demonstrates the use of the  Factory Design Pattern.
 * It uses ShapeFactory to create instances of different shape(Circle, Rectangle and Square)
 * based on provided input and invokes their draw methods.
 * @author admin
 */
public class FactoryPatternDemo {

    /**
     * The main method demonstrates  how the Factory Pattern works by creating a ShapeFactory to produce different shapes based on input.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    } 
}
