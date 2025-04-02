/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.tightCoupling;

/**
 *
 * @author Panda
 */
public class Subject {

    static Topic topic = new Topic();

    public static void startReading(String definition) {

        topic.definition = definition;
        topic.understand();
    }
}
