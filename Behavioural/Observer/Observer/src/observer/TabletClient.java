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
class TabletClient extends Observer {

    public TabletClient(MessageStream subject) {
        this.subject = subject;
        subject.attach(this);
    }

    void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream " + subject.getState());
    }   
}
