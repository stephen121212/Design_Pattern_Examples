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
class CEO extends Handler {
    public void handleRequest(Request request){
        System.out.println("CEOs can approve anything they want");
    }
}
