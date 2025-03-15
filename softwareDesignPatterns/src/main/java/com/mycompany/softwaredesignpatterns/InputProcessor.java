/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softwaredesignpatterns;

import java.util.Scanner;

/**
 *
 * @author Panda
 */
public class InputProcessor {

    public static Pair process() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNumber = scanner.nextLine();
        
        Pair pair = new Pair(firstNumber, secondNumber);

        scanner.close();
        
        return pair;
    }

}
