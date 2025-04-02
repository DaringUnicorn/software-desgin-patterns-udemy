/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.LSPViolationSolution;

/**
 *
 * @author Panda
 */
public class Bicycle implements IVehicle {

    int speed;

    @Override
    public void setSpeed(int speed) {
        if (speed > 50) {
            System.out.println("Bicycles cannot go above 50 km/h");
        }
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

}
