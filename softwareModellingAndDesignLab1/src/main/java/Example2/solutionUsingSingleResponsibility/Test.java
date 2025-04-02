/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example2.solutionUsingSingleResponsibility;

/**
 *
 * @author Panda
 */
public class Test {
    public static void main(String[] args) {
        RepairServices repairServices = new RepairServices();
        
        repairServices.setVehicle(new Vehicle("Togg"));
        repairServices.setVehicle(new Vehicle("Sedan"));
        repairServices.setVehicle(new Vehicle("Sedan1"));
    }
}
