/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example4;

/**
 *
 * @author Panda
 */
public class MyArray {
    int[] array;
    void filterArray(IFilter filter){
        for(int i : array){
            if(filter.apply(i)){
                System.out.println("i");
            }
        }
    }
}
