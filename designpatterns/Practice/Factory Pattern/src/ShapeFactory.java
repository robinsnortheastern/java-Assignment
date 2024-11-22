/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The ShapeFactory class provides a method to create objects of different shapes(Circle, Rectangle, Square) based on input provided.
 * The factory eliminates the need for the client code to directly instantiate  shape objects,
 * improving maintainability and scalability.
 * @author admin
 */
public class ShapeFactory {
    
    /**
     * Returns an instance  of a Shape based on the given shape type.
     * @param shapeType the type of the shape to create(e.g. 'CIRCLE', 'RECTANGLE', 'SQUARE')
     * @return a shape object of specified type {@code null} if the  type is invalid or not supported
     */
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } 
        return null;
    }
}
