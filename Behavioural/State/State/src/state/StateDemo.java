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
public class StateDemo {

    public static void main(String[] args) {
        Fan fan = new Fan(); 
        System.out.println(fan);
        fan.pullChain(); 
        System.out.println(fan);   
        fan.pullChain();
        System.out.println(fan);
         fan.pullChain();
        System.out.println(fan);
         fan.pullChain();
        System.out.println(fan);
         fan.pullChain();
        System.out.println(fan);
    }
}
