/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.usingComposition;

/**
 *
 * @author Panda
 */
public class Vehicle {

    IColor colorSetter;

    public Vehicle(IColor colorSetter) {
        this.colorSetter = colorSetter;
    }

    void displayColor() {
        colorSetter.setColor();
    }
}
