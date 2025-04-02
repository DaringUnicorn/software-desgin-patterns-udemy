/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example2.compositionOverInheritance;

/**
 *
 * @author Panda
 */
public class Calculator {
    int a,b;
    
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    int calculate(IOperation operation){
        return operation.operate(a, b);
    }
}
