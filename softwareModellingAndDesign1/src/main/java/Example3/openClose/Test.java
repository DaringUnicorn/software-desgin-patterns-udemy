/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.openClose;

/**
 *
 * @author Panda
 */
public class Test {

    public static void main(String[] args) {

        IShape shape1 = new Square(5);
        IShape shape2 = new Rectangle(10, 5);
        IShape shape3 = new Rectangle(5, 5);

        IShape[] shapes = {shape1, shape2, shape3};

        for (IShape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }

}
