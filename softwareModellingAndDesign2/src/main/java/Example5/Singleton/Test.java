/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example5.Singleton;

/**
 *
 * @author Panda
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(EagerSingleton.instance);
        System.out.println(EagerSingleton.instance);

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton.getInstance());
        System.out.println(lazySingleton1.getInstance());
        System.out.println(lazySingleton2.getInstance());
    }
}
