/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitutionPrinciple;

/**
 *
 * @author Panda
 */
public class PetrolCar extends Vehicle implements IVehicle {

    public PetrolCar(int age, String type) {
        super(age, type);
    }

    @Override
    protected void speedUp() {
        System.out.println("Car is speeding up....");
    }

    @Override
    protected void slowDown() {
        System.out.println("Car is slowing down....");
    }

    @Override
    protected void fuel() {
        System.out.println("We can use petrol without any problem");
    }

    @Override
    public void Ifuel() {
        System.out.println("We can use petrol without any problem with interface");
    }

}
