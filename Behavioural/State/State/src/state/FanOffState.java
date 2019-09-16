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
    public class FanOffState extends State {

    private Fan fan;
    
    public FanOffState(Fan fan) {
        this.fan = fan;
    }
    
    @Override
    public void handleRequest(){
        System.out.println("Turning fan on to low");
        fan.setState(fan.getFanLowState());
    }
    
    public String toString(){
        return "Fan is off.";
    }
}
