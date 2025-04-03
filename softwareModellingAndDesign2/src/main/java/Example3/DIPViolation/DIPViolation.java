/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example3.DIPViolation;

/**
 *
 * @author Panda
 */
public class DIPViolation {

    class MySQLDatabase {

        public void saveOrder(String order) {
            System.out.println("Saving order in MySQL:" + order);
        }
    }

    class OrderService {

        private MySQLDatabase database;

        public OrderService() {
            this.database = new MySQLDatabase();

        }

        public void placeOrder(String order) {
            System.out.println("Placing order:" + order);
        }
    }

    public class BadDIPExample {

        public static void main(String[] args) {
            // OrderService orderService = new OrderService();
            //orderService.placeOrder("Laptop");
        }
    }
}
