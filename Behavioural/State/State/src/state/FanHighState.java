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
public class FanHighState extends State {

   private Fan fan;
    
    public FanHighState(Fan fan) {
        this.fan = fan;
    }
    
    @Override
    public void handleRequest(){
        System.out.println("Turning fan off");
        fan.setState(fan.getFanOffState());
    }
    
    public String toString(){
        return "Fan is on high.";
    }
}
