/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.beforeIoC;

/**
 *
 * @author Panda
 */
public class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String needsRepair() {
        return model + " needs repair.";
    }

    public String getModel() {
        return model;
    }

    class Mechanic {

        private Car car;

        public Mechanic(Car car) {
            this.car = car;
        }

        public String repair() {
            return "Repairing " + car.getModel() + ". The car is now fixed.";
        }
    }
}
