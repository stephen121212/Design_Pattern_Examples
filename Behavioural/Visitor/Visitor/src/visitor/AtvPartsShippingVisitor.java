/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.List;

/**
 *
 * @author Stephen
 */
class AtvPartsShippingVisitor implements AtvPartVisitor {
    double shippingAmount = 0;
    
    @Override
    public void visit(Wheel wheel){
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship");
    }
    
    @Override
    public void visit(Fender fender){
        shippingAmount += 3;
        System.out.println("Fenders are lights and cheap to ship");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil is hazardous and has a fee to ship");
    }

    @Override
    public void visit(PartsOrder order) {
        System.out.println("If they have bought more than 3 things, we will give them a discount");
        List<AtvPart> parts = order.getParts();
        if(parts.size()>3){
            shippingAmount -= 5;
        }
        System.out.print("Shipping amount is:  " + shippingAmount);
    }  
}
