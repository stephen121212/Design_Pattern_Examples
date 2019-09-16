/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Stephen
 */
public class Order {
    private final int orderNumber;
    private final Item item;
    
    Order(int orderNumber, Item item){
        this.orderNumber = orderNumber;
        this.item = item;
    }
    
    void processOrder(){
        System.out.println("Ordering "+ item + " for order number " + orderNumber);
    }
}
