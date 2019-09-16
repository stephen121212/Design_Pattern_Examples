/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

import java.util.List;

/**
 *
 * @author Stephen
 */
public class allLightsCommand implements CommandPattern {

   private List<Light>lights;
   
   public allLightsCommand(List<Light>lights)
   {
       this.lights = lights;
   }
   
   @Override
   public void execute(){
       for(Light light: lights){
           if(light.isOn()){
             light.toggle();   
           }
       }
   }
}
