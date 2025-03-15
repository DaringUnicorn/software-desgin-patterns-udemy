/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openClosePrincipleExample;

/**
 *
 * @author Panda
 */
public class App {
    public static void main(String[] args) {
        SortingProcessor.execute(new InsertionSort());
        SortingProcessor.execute(new MergeSort());
        SortingProcessor.execute(new SelectionSort());
    }
    
}
