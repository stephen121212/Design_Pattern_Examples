/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Stephen
 */
public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        
        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
    }
}
