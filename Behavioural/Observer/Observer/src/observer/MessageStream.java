/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Stephen
 */
class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
    
}
