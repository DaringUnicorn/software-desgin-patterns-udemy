/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitutionPrinciple;

/**
 *
 * @author Panda
 */
public class ElectricCar extends Vehicle {

    public ElectricCar(int age, String type) {
        super(age, type);
    }

    @Override
    protected void speedUp() {
        System.out.println("Electic car is speeding up....");
    }

    @Override
    protected void slowDown() {
        System.out.println("Electic car is slowing down....");
    }

    @Override
    protected void fuel() {
        System.out.println("Electric car is being charged");
    }

}
