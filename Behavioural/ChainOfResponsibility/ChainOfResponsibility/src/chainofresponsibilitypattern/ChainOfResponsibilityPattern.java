/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilitypattern;

/**
 *
 * @author Stephen
 */
public class ChainOfResponsibilityPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();
        
        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);
        
        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);
        
        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);
        
        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
    
}
