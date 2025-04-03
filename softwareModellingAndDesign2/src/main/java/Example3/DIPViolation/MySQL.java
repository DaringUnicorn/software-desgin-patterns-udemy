/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.DIPViolation;

/**
 *
 * @author Panda
 */
public class MySQL implements IDatabase {

    @Override
    public void saveOrder(String order) {
        System.out.println("MY SQL implementation");
    }

}
