/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Stephen
 */
public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();
    
    void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }
    
    void process(){
        for(Order order : orders){
            order.processOrder();
            orders.remove(order);
        }
    }
    
    String report(){
        return "\nTotal Item objects made: " + catalog.totalItemsMode();
    }
}
