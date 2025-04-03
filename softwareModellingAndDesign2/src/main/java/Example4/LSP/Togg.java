/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example4.LSP;

/**
 *
 * @author Panda
 */
public class Togg extends Car {

    public void setModel(int model) {
        System.out.println("Togg int model");
    }

    @Override
    public void setModel(String model) throws IndexOutOfBoundsException {
        super.setModel(model);
        System.out.println("Togg overridden method is called");
        throw new IndexOutOfBoundsException();
    }

}
