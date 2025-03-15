/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitutionPrinciple;

/**
 *
 * @author Panda
 */
public class App {

    public static void main(String[] args) {

        Vehicle vehicle = new PetrolCar(6, "Ford");
        vehicle.speedUp();
        vehicle.slowDown();
        vehicle.fuel();

        Vehicle electicCar = new ElectricCar(12, "Tesla");
        electicCar.speedUp();
        electicCar.slowDown();
        electicCar.fuel();

    }

}
