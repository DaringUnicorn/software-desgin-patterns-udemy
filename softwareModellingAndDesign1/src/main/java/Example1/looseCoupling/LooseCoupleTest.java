/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example1.looseCoupling;

/**
 *
 * @author Panda
 */
public class LooseCoupleTest {
    public static void main(String[] args) {
        Topic topic = new Topic();
        topic.definition = "**default definition**";
        topic.i = 10;
        Subject subject = new Subject(topic);
        subject.startReading();
        
    }
    
}
