/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
public class CommandDemo {
    public static void main(String args[]){
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();
        
        CommandPattern toggleCommand = new Toggle(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
        
        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        CommandPattern alltheLightsCommand = new allLightsCommand(lights);
        
        lightSwitch.storeAndExecute(alltheLightsCommand);
    }
}
