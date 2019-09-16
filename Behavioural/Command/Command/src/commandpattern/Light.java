/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Stephen
 */
public class Light {
    private boolean isOn = false;
    
    public boolean isOn(){
        return isOn;
    }
    
    public void toggle(){
        if(isOn){
            off();
            isOn = false;
        }
        else{
            on();
            isOn = true;
        }
    }
    
    public void on(){
        System.out.println("Light switched on");
    }
    
     public void off(){
        System.out.println("Light switched off");
    }
}
