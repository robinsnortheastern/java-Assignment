/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpatterndemo;

/**
 *The SingleObject class demonstrates the Singleton design pattern.
 * It ensures that only one instance of the class exists and provides a global access point to that instance.
 * @author admin
 */
public class SingleObject {
    
    /**
     * Holds the single instance of the SingleObject class.
     * 
     */
    private static SingleObject instance = new SingleObject();
    
    
    /**
     * Private constructor to prevent instantiation.
     */
    public SingleObject(){}
    
    
     /**
     * Retrieves the single instance of the SingleObject class.
     *
     * @return the unique instance of SingleObject
     */
    public static SingleObject getInstance(){
        return instance;
    }
    
    
    /**
     * Displays a "Hello World" message to the console.
     */
    public String showMessage(){
        System.out.println("Hello World");
        String str= "Robins";
        return str;
    }
}
