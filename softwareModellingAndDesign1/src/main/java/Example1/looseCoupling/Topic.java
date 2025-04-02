/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.looseCoupling;

/**
 *
 * @author Panda
 */
public class Topic implements ITopic {

    String definition;
    int i;
    int j;

    @Override
    public void understand() {
        System.out.println("Tight coupling concept: " + definition);
    }

}
