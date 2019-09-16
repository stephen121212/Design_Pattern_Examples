/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
public class MediatorDemo {
    
    public static void main(String []args){
        Mediator mediator = new Mediator();
        
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);
        
        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();
        
        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }
}
