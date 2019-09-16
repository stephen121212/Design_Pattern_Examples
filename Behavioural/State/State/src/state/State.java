/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Stephen
 */
public abstract class State {
    public void handleRequest(){
        System.out.println("Shouldn't be able to get here.");
    }
}
