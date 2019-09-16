/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Stephen
 */
public class TemplateMethod {
    public static void main(String[] args) {
        System.out.println("Web Order: ");
        
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
        
        System.out.println("Store Order: ");
        
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();  
    }
}
