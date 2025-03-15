/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitutionPrinciple;

/**
 *
 * @author Panda
 */
public abstract class Vehicle {

    protected int age;
    protected String type;

    public Vehicle(int age, String type) {
        this.type = type;
        this.age = age;
    }

    protected void speedUp() {
        System.out.println("Vehicle is speeding up....");
    }

    protected void slowDown() {
        System.out.println("Vehicle is slowing down....");
    }

    protected abstract void fuel();

}
