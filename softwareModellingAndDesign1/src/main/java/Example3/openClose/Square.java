/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.openClose;

/**
 *
 * @author Panda
 */
public class Square implements IShape {

    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int calculateArea() {
        return a * a;
    }
}
