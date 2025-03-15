/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softwaredesignpatterns;

/**
 *
 * @author Panda
 */
public class App {

    public static void main(String[] args) {
        
        Pair pair = InputProcessor.process();
       
        if(ViolationChecker.isValid(pair)){
            System.out.println("At least one of the inputs is invalid...");
            return;
        }
        int firstInteger = Integer.valueOf(pair.getFirst());
        int secondInteger = Integer.valueOf(pair.getSecond());
        
        int result = Operation.execute(firstInteger, secondInteger);
        
        System.out.println("The result is " + result);
        System.out.println("End of the application!");
        
        
    }
    
}
