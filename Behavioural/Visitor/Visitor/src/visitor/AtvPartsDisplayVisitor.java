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
class AtvPartsDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Fender fender) {
         System.out.println("We have a fender");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel");
    }

    @Override
    public void visit(Oil oil) {
       System.out.println("We have oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order");
    }
    
}
