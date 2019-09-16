/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Stephen
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new MessageStream();
        
        PhoneClient phoneClient = new PhoneClient((MessageStream) subject);
        TabletClient tabletClient = new TabletClient((MessageStream) subject);
        
        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");
    }
}
