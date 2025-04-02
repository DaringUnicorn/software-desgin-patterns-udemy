/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example2.compositionOverInheritance;

/**
 *
 * @author Panda
 */
public class Test {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2, 1);
        class sum implements IOperation {

            @Override
            public int operate(int a, int b) {
                return a + b;
            }

        }
        
        System.out.println(calculator.calculate(new sum()));
    }

}
