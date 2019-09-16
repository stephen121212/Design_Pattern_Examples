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
public class Toggle implements CommandPattern{
    private Light light;
    
    public Toggle(Light light){
        this.light = light;
    }
    
    public void execute(){
        light.toggle();
    }
}
