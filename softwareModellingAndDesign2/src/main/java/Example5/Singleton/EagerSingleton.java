/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example5.Singleton;

/**
 *
 * @author Panda
 */
public class EagerSingleton {

    static EagerSingleton instance;

    private EagerSingleton() {

    }

    static {
        instance = new EagerSingleton();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
