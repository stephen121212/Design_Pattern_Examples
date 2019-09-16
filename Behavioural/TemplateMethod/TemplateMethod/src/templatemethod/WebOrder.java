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
class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Get items from cart,");
        System.out.println("Set gift preferences,");
        System.out.println("Set delivery address,");
        System.out.println("Set billing address,");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    public void doReceipt() {
       System.out.println("Email Receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to address");
    }
}
