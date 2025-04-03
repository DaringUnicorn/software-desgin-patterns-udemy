/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example4.LSP;

/**
 *
 * @author Panda
 */
public class Car {

    String model;

    public void setModel(String model) throws NullPointerException {
        this.model = model;
        System.out.println("Car set model with string");
        throw new NullPointerException();
    }

    public String getModel() {
        return model;
    }
}
