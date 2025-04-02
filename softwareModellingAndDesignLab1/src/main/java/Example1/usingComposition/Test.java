/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.usingComposition;

/**
 *
 * @author Panda
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(new SetColorBlue());
        car.displayColor();
        
        Bike bike = new Bike(new SetColorRed());
        bike.displayColor();
        
        Car car1 = new Car(() -> {System.out.println("My color is yellow");});
        car1.displayColor();
    }
    
}
