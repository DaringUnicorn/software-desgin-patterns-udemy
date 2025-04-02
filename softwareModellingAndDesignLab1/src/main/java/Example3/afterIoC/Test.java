/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.afterIoC;

/**
 *
 * @author Panda
 */
public class Test {

    public static void main(String[] args) {
        ICar car = new Car("Togg");
        RepairServices repairServices = new RepairServices(car);
        System.out.println(repairServices.repair());
    }
}
