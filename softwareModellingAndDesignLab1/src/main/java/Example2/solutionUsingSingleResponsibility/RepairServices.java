/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example2.solutionUsingSingleResponsibility;

/**
 *
 * @author Panda
 */
public class RepairServices {

    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void repair() {
        System.out.println("Repairing" + vehicle.getModel());
    }

    public void checkParts() {
        System.out.println("Checking parts for " + vehicle.getModel());
    }

    public void orderParts() {
        System.out.println("Ordering parts for " + vehicle.getModel());
    }
}
