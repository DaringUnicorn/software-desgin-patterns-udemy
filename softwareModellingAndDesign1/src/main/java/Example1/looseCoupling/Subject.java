/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.looseCoupling;

/**
 *
 * @author Panda
 */
public class Subject {

    ITopic topic;

    public Subject(ITopic topic) {
        this.topic = topic;
    }

    public void startReading() {
        topic.understand();

    }
}
