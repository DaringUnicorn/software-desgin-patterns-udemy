/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softwaredesignpatterns;

/**
 *
 * @author Panda
 */
public class ViolationChecker {

    public static boolean isValid(Pair pair){
        
        String first = pair.getFirst();
        String second = pair.getSecond();
        
        try{
            Integer.parseInt(first);
            
        }catch(NumberFormatException exception){
            System.out.println("First number is not valid...");
            return false;
        }
        
        
        try{
            Integer.parseInt(second);
            
        }catch(NumberFormatException exception){
            System.out.println("Second number is not valid...");
            return false;
        }
        
        return true;
        
    }

    
}
