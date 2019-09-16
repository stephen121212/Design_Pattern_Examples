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
public class PhoneClient extends Observer {
    public PhoneClient(MessageStream subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " - sent from phone");
    }
    
    @Override
    void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }
}
